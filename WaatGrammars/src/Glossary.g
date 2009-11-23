grammar Glossary;

options {
	output=AST;
}

@header {
	package br.com.ceut.waat.glossary;
	import br.com.ceut.waat.glossary.rules.*;
}


glossary returns [Glossary r_glossary] 
	:	
		entitylist=entityList {$r_glossary = new Glossary(entitylist.r_entitylist);}
	;

entityList returns [List<Entity> r_entitylist]
@init { $r_entitylist = new ArrayList<Entity>(); }
	:	
		(e=entity {$r_entitylist.add(e.r_entity);})+
	;

entity returns [Entity r_entity]
	:	
		'Entidade' '-' entityname=entityName ':' 'Descricao:' text* ';' 'Atributos:' attributelist=attributeList
		{ $r_entity = new Entity(entityname.r_entityname, attributelist.r_attributelist); }
	;

entityName returns [String r_entityname]
@init { $r_entityname = new String(); }
	:	
		(entitynamepart=ID { $r_entityname = $r_entityname.concat(" " + entitynamepart.getText()); } )+
		{ $r_entityname = $r_entityname.trim(); }
	;	

text	:	
		(WHITESPACE | ID | '"' | ',' | '/')+
	;

attributeList returns [List<Attribute> r_attributelist]
@init { $r_attributelist = new ArrayList<Attribute>(); }
	:	
		(a=attribute { $r_attributelist.add(a.r_attribute); })+
	;

attribute returns [Attribute r_attribute]
	:	
		'-' attributename=ID mandatory=STAR? ',' attributetype=attributeType ';'
		{ 	
			if($mandatory != null) {
				$r_attribute = new Attribute(attributename.getText(), true, attributetype.r_attributetype);
			}
			else {
				$r_attribute = new Attribute(attributename.getText(), false, attributetype.r_attributetype);
			}
		}
	;

attributeType returns [AttributeInfo r_attributetype]
	:	
		//entityreference=entityReference { $r_attributetype = new AttributeInfoEntityReference("entity_reference", entityreference.r_entityreference); } | 
		//multiplechoice=multipleChoice { $r_attributetype = multiplechoice.r_multiplechoice; } | 
		texttype=textType { $r_attributetype = texttype.r_texttype; } | 
		//l=list { $r_attributetype = l.r_list; } | 
		INTEGER { $r_attributetype = new AttributeInfoInteger("integer"); } |
		FLOATING_POINT { $r_attributetype = new AttributeInfoFloat("float"); }
	;

//entityReference returns [EntityReference r_entityreference]
//	:	
//		'{' systemname=ID '.' entityname=ID '}'  { $r_entityreference = new EntityReference(systemname.getText(), entityname.getText()); }
//	;

//multipleChoice returns [AttributeInfoMultipleChoice r_multiplechoice]
//	:	
//		MULTIPLA '['defaul=GRID? c=choice choicelist=choiceList  ']' 
//		{
//			if($defaul.getText() != null) {
//				$r_multiplechoice = new AttributeInfoMultipleChoice("multiple_choice", c.r_choice, choicelist.r_choicelist);
//			} else {
//				choicelist.r_choicelist.add($c.r_choice);
//				$r_multiplechoice = new AttributeInfoMultipleChoice("multiple_choice", choicelist.r_choicelist);
//			}
//		}
//	;

//choiceList returns [List<Choice> r_choicelist] 
//@init { $r_choicelist = new ArrayList<Choice>(); }
//	:	
//		( ',' c=choice { $r_choicelist.add(c.r_choice); })*
//	;

//choice	returns [Choice r_choice]
//	:	
//		'(' choiceid=INT '-' choicename=ID ')' { $r_choice = new Choice(Integer.parseInt(choiceid.getText()), choicename.getText()); }
//	;

textType returns [AttributeInfoText r_texttype]
	:	
		TEXT '(' textsize=INT ')' { $r_texttype = new AttributeInfoText("text", Integer.parseInt(textsize.getText())); }
	;

//list returns [AttributeInfoList r_list]
//	:	
//		LIST  entityreference=entityReference { $r_list = new AttributeInfoList("list", entityreference.r_entityreference); }
//	;

FLOATING_POINT		:	'PONTO FLUTUANTE';
INTEGER			:	'INTEIRO';
CPF			:	'CPF';
CNPJ			:	'CNPJ';
LIST			:	'LISTA';
TEXT			:	'TEXTO';
GRID			:	'#';
MULTIPLA		:	'MULTIPLA';
DATA			:	'DATA';
STAR			:	'*';
ID  			:	(('a'..'z'|'A'..'Z')+ INT? ('a'..'z'|'A'..'Z')*)+ ;
INT 			:	'0'..'9'+ ;
FLOAT			:	('0'..'9')+ '.' ('0'..'9')+;
NEWLINE			:	'\r'? '\n' {skip();};
WHITESPACE  		:	(' '|'\t')+ {skip();} ;


