grammar UIGrammar;

options {
	output=AST;
}

@header {
	package br.com.ceut.waat.interfaces;
	import br.com.ceut.waat.interfaces.rules.*;
}

uiPrototype returns [UiPrototype r_uiprototype]
	: 
		'Interface_com_Usuario' '-' '"' name=multiWordID '"' ':' components=htmlComponentList 
		{ $r_uiprototype = new UiPrototype(name.r_multiwordid, components.r_htmlcomponentlist); }
	;

htmlComponentList returns [List<HTMLComponent> r_htmlcomponentlist]
@init { $r_htmlcomponentlist = new ArrayList<HTMLComponent>(); }
	:	(htmlcomponent=htmlComponent { $r_htmlcomponentlist.add(htmlcomponent.r_htmlcomponent); })+
	;

htmlComponent returns [HTMLComponent r_htmlcomponent]
	:	
		s=select { $r_htmlcomponent = s.r_select; } |
		f=field { $r_htmlcomponent = f.r_field; } |
		b=button { $r_htmlcomponent = b.r_button; } |
		rb=radioButton { $r_htmlcomponent = rb.r_radiobutton; } |
		cb=checkBox { $r_htmlcomponent = cb.r_checkbox; }
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

field returns [HTMLComponentField r_field]
	:	
		'Campo' type=FIELD_TYPE '"' name=multiWordID '"' attributereference=attributeReference writeorread=writeOrReadOnly ';'  { $r_field = new HTMLComponentField(type.getText(), name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); }
	;

button returns [HTMLComponentButton r_button]
	:	
		'Botao' '"' name=multiWordID '"' 'Acao' '"' action=multiWordID '"' ';' { $r_button = new HTMLComponentButton(name.r_multiwordid, action.r_multiwordid); }

	;

radioButton returns [HTMLComponentRadioButton r_radiobutton]
	:	
		'Radio' '"' name=multiWordID '"' attributereference=attributeReference writeorread=writeOrReadOnly ';' { $r_radiobutton = new HTMLComponentRadioButton(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); }
	;

checkBox returns [HTMLComponentCheckBox r_checkbox]
	:	
		'Checkbox' '"' name=multiWordID '"' attributereference=attributeReference writeorread=writeOrReadOnly ';' { $r_checkbox = new HTMLComponentCheckBox(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); }
	;

select returns [HTMLComponentSelect r_select]
	:	
		'Select' '"' name=multiWordID '"' attributereference=attributeReference writeorread=writeOrReadOnly ';'{ $r_select = new HTMLComponentSelect(name.r_multiwordid, attributereference.r_attributereference, writeorread.r_writeorreadonly); }
	;

attributeReferenceList returns [List<AttributeReference> r_attributereferencelist]
@init { $r_attributereferencelist = new ArrayList<AttributeReference>(); }
	:	
		attributereference=attributeReference { $r_attributereferencelist.add(attributereference.r_attributereference); }
		(',' another=attributeReference { $r_attributereferencelist.add(another.r_attributereference); } )*
	;

multiWordID returns [String r_multiwordid]
@init { $r_multiwordid = new String(" "); }
	:	
		(namepart=ID { $r_multiwordid = $r_multiwordid.concat(namepart.getText() + " "); })+
		{ $r_multiwordid = $r_multiwordid.trim(); }
	;
	
writeOrReadOnly returns [String r_writeorreadonly]
	:	
		write='Escrita' { $r_writeorreadonly = write.getText(); } | 
		readonly='Leitura' { $r_writeorreadonly = readonly.getText(); }
	;

FIELD_TYPE		:	'Tipo_Texto' | 'Tipo_Senha' | 'Tipo_Arquivo';
ID  			:	('a'..'z'|'A'..'Z'|'ç' | 'Ç' | 'Á' | 'á' | 'Â' | 'â' | 'Ã' | 'ã' | 'É' | 'ú' |'Ú'|'ê'|'Ê')+ ;
INT 			:	'0'..'9'+ ;
NEWLINE			:	'\r'? '\n' {skip();};
WHITESPACE  		:	(' '|'\t')+ {skip();} ;
