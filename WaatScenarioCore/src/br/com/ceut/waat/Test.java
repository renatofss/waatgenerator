package br.com.ceut.waat;

import br.com.ceut.waat.scenarios.ScenarioInterpreter;

public class Test {

	public static void main(String[] args) {
	
		String text = "Cenario 1 - \"Fazer Login\":" +
						"Pre-Condicao:" +
						"- Executar Autenticar.Login;" +
						"1. Usuario preenche Campo \"Login\";" +
						"2. Usuario preenche Campo \"Senha\";" +
						"3. Usuario clica Botao \"Fazer Login\";" +
						"4. Sistema exibe Mensagem \"Autenticado com sucesso\";";
		
		ScenarioInterpreter si = new ScenarioInterpreter();
		System.out.println(si.parseToXML(text));
		
	}
	
}
