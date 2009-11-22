package br.com.ceut.waat.interfaces;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 * 
 * @author ernesto
 * 
 *         Classe responsável por interpretar o caso de uso e gerar a hierárquia
 *         de objetos equivalentes. A classe UseCase faz o parse dos objetos
 *         para XML e seta no atribute de classe output desta classe.
 * 
 */
public class UiInterpreter extends Thread{

	/**
	 * Variável destinada a receber o valor do XML após o parser.
	 */
	private static String output;

	public static void setOutput(String newOutput) {
		output = newOutput;
	}

	public String getOutput() {
		return output;
	}

	/**
	 * Recebe uma String de input contendo o texto a ser parseado e o caminho
	 * para o arquivo .xml que será gerado após o parse.
	 * 
	 * @param input
	 *            String contendo o texto que será parseado.
	 * @return uma String contendo o XML gerado.
	 */
	public String parseToXML(String input) {
		
		try {
			UIGrammarLexer lexer = new UIGrammarLexer(new ANTLRStringStream(
					input));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			UIGrammarParser parser = new UIGrammarParser(tokens);
			parser.uiPrototype();
		} catch (RecognitionException e1) {
			e1.printStackTrace();
		}

		return output;
	}
	
	public static UiInterpreter getInstance() {
		return new UiInterpreter();
	}
}
