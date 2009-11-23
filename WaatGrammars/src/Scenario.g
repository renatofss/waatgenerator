grammar Scenario;

options {
	output=AST;
}

@header {
	package br.com.ceut.waat.scenarios;
	import br.com.ceut.waat.scenarios.rules.*;
}

scenario returns [Scenario r_scenario]
	:	'Cenario' number=INT '-' '"' name=multiWordID '"' ':'  precondition=preCondition? steplist=stepList
		{ 
			if(precondition != null) {
				$r_scenario = new Scenario(Integer.parseInt(number.getText()), name.r_multiwordid, precondition.r_precondition, steplist.r_steplist); 
			} else {
				$r_scenario = new Scenario(Integer.parseInt(number.getText()), name.r_multiwordid, null, steplist.r_steplist); 
			}
		}
	;

preCondition returns [PreCondition r_precondition]
	:	'Pre-Condicao:' preconditionsteplist=preConditionStepList
		{ $r_precondition = new PreCondition(preconditionsteplist.r_preconditionsteplist); }
	;

preConditionStepList returns [List<PreConditionStep> r_preconditionsteplist]
@init { $r_preconditionsteplist = new ArrayList<PreConditionStep>(); }
	:	(preconditionstep=preConditionStep { $r_preconditionsteplist.add(preconditionstep.r_preconditionstep); })+
	;

preConditionStep returns [PreConditionStep r_preconditionstep]
	:	'-' systemaction=systemAction ';' { $r_preconditionstep = new PreConditionStep(systemaction.r_systemaction); }
	;

systemAction returns [SystemAction r_systemaction]
	:	'Executar' scenarioreference=scenarioReference { $r_systemaction = new SystemAction(scenarioreference.r_scenarioreference); }
	;

scenarioReference returns [ScenarioReference r_scenarioreference]
	:	usecasename=multiWordID '.' scenarioname=multiWordID { $r_scenarioreference = new ScenarioReference(usecasename.r_multiwordid, scenarioname.r_multiwordid); }
	;

stepList returns [List<Step> r_steplist]
@init { $r_steplist = new ArrayList<Step>(); }
	:	(s=step { $r_steplist.add(s.r_step); })+
	;

step returns [Step r_step]
	:	number=stepId actor=ACTOR action=ACTION i=item ';' { $r_step = new SimpleStep(number.r_stepid, actor.getText(), action.getText(), i.r_item); }|
		number=stepId multiplePaths
	;

stepId	returns [String r_stepid]
@init { $r_stepid = new String(""); }
	:	id=INT { $r_stepid =  $r_stepid.concat(id.getText()); } '.'
		//('.' { $r_stepid.concat("."); } subid=INT { $r_stepid.concat(subid.getText()); })* '.' 
		//{ $r_stepid = $r_stepid.trim(); }
	;
	
multiplePaths returns [MultiplePaths r_multiplepaths]
	:	'Ha' quantity=INT 'caminhos' ':' pathlist=pathList { $r_multiplepaths = new MultiplePaths(Integer.parseInt(quantity.getText()), pathlist.r_pathlist); }
	;

pathList returns [List<Path> r_pathlist]
@init { $r_pathlist = new ArrayList<Path>(); }
	:	(p=path { $r_pathlist.add(p.r_path); })+
	;

path returns [Path r_path]
	:	
		id=ID ')' actor=ACTOR action=ACTION i=item ':' pathsteplist=pathStepList
		{ $r_path = new Path(id.getText(), actor.getText(), action.getText(), i.r_item, pathsteplist.r_pathsteplist); }
	;

pathStepList returns [List<PathStep> r_pathsteplist]
@init { $r_pathsteplist = new ArrayList<PathStep>(); }
	:	(pathstep=pathStep { $r_pathsteplist.add(pathstep.r_pathstep); })+
	;

pathStep returns [PathStep r_pathstep]
	:	
		psaction=pathStepAction ';' { $r_pathstep = psaction.r_pathstepaction; } |
		psasserts=pathStepAsserts ';' { $r_pathstep = psasserts.r_pathstepasserts; }
	;

pathStepAction returns [PathStepAction r_pathstepaction]
	:	'-' actor=ACTOR action=ACTION i=item { $r_pathstepaction = new PathStepAction(actor.getText(), action.getText(), i.r_item); }	
	;

pathStepAsserts	returns [PathStepAsserts r_pathstepasserts]
	:	'-' actor=ACTOR 'valida' i=item { $r_pathstepasserts = new PathStepAsserts(actor.getText(), i.r_item); }
	;



attributeReference returns [AttributeReference r_attributereference]
	:	'{' attributeid=attributeId '}' { $r_attributereference = new AttributeReference(attributeid.r_attributeid); }
	;

attributeId returns [AttributeId r_attributeid]
	:	entity=multiWordID '.' (attribute=multiWordID | attributeid=attributeId)
		{
			if(attribute != null) {
				$r_attributeid = new AttributeId(entity.r_multiwordid, attribute.r_multiwordid, null);
			} else if(attributeid != null) {
				$r_attributeid = new AttributeId(entity.r_multiwordid, null, attributeid.r_attributeid);
			}
		}
	;

attributeReferenceList returns [List<AttributeReference> r_attributereferencelist]
@init { $r_attributereferencelist = new ArrayList<AttributeReference>(); }
	:	
		attributereference=attributeReference { $r_attributereferencelist.add(attributereference.r_attributereference); }
		(',' another=attributeReference { $r_attributereferencelist.add(another.r_attributereference); } )*
	;

item returns [Item r_item]
	:	
		'Link' '"' name=multiWordID '"' 'sessao' session=multiWordID { $r_item = new ItemLink("Link", name.r_multiwordid, session.r_multiwordid); } |
		'Campo' '"' name=multiWordID '"' { $r_item = new ItemField("Campo", name.r_multiwordid); } |
		'Select' '"' name=multiWordID '"' { $r_item = new ItemSelect("Select", name.r_multiwordid); } |
		'Botao' '"' name=multiWordID '"' { $r_item = new ItemButton("Botao", name.r_multiwordid); } |
		'Formulario' { $r_item = new ItemForm("Formulario"); } |
		'Atributos' { $r_item = new ItemAttributes("Atributos"); } |
		'Mensagem' '"' name=multiWordID '"' { $r_item = new ItemMessage("Mensagem", name.r_multiwordid); }
	;

multiWordID returns [String r_multiwordid]
@init { $r_multiwordid = new String(" "); }
	:	
		(namepart=ID { $r_multiwordid = $r_multiwordid.concat(namepart.getText() + " "); })+
		{ $r_multiwordid = $r_multiwordid.trim(); }
	;


ACTION			:	'clica' | 'seleciona' | 'preenche' | 'inclui' | 'apaga' | 'exibe' | 'valida';
ACTOR			:	'Usuario' | 'Sistema';
ID  			:	('a'..'z'|'A'..'Z'|'ç' | 'Ç' | 'Á' | 'á' | 'Â' | 'â' | 'Ã' | 'ã' | 'É' | 'ú' |'Ú'|'ê'|'Ê')+ ;
INT 			:	'0'..'9'+ ;
NEWLINE			:	'\r'? '\n' {skip();};
WHITESPACE  		:	(' '|'\t')+ {skip();} ;
