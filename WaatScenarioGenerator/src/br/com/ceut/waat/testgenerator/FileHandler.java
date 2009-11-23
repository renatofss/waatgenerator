package br.com.ceut.waat.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ernestocid
 * 
 *         Classe utilizada para facilitar a manipulação de arquivos *
 */
public class FileHandler {

	/**
	 * Arquivo que será manipulado pelo FileHandler
	 */
	private File file;

	/**
	 * Construtor padrão da Classe
	 * 
	 * @param file
	 */
	public FileHandler(File file) {
		super();
		this.file = file;
	}

	/**
	 * Extrai o texto contido no arquivo
	 * 
	 * @return texto contido no arquivo se o arquivo possui algum conteúdo, caso
	 *         contrário retorna null
	 */
	public String getFileText() {
		try {
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			String line = "";
			StringBuffer text = new StringBuffer("");

			while ((line = bf.readLine()) != null) {
				text.append(line);
				text.append("\n");
			}

			return text.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
