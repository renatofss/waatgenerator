package br.com.ceut.waat;

import br.com.ceut.waat.interfaces.UiInterpreter;

public class Test extends Thread {

	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		String text = "Interface_com_Usuario - \"Fazer Login\": \nCampo Tipo_Texto \"Usuario\" {Usuario.login} Escrita; \nCampo Tipo_Senha \"Senha\" {Usuario.senha} Leitura; Radio \"Isso e um radio\" {Usuario.tipo} Escrita; Checkbox \"Isso e uma checkbox\" {Usuario.ativo} Escrita; Select \"Opcoes\" {Usuario.opcoes} Escrita; Botao \"Logar\" Acao \"Tal\";";		
		UiInterpreter ui = new UiInterpreter();
		System.out.println(ui.parseToXML(text));
	}
}
