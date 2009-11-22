package br.com.ceut.waat;

import br.com.ceut.waat.glossary.GlossaryInterpreter;

public class Test {

	public static void main(String[] args) {
		String text =
					"Entidade - Usuario:" + "\n" +
					"Descricao: ator que representa um usuario do sistema;" + "\n" +
					"Atributos:" + "\n" +
					"- Login*, TEXTO(20);" + "\n" +
					"- Senha*, TEXTO(12);"
				;

		GlossaryInterpreter si = new GlossaryInterpreter();
		System.out.println(si.parseToXML(text));
	}

}
