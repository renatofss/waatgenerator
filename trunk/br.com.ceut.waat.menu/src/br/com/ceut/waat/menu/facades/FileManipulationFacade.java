package br.com.ceut.waat.menu.facades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulationFacade {

	public static String readFileContent(File file) {

		StringBuffer fileContent = new StringBuffer("");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = reader.readLine()) != null) {
				fileContent.append(line + "\n");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileContent.toString();
	}

	public static boolean createFolder(String folderPath) {
		File file = new File(folderPath);

		boolean fileCreated = false;
		fileCreated = file.mkdirs();

		return fileCreated;
	}

	public static File createFile(String folder, String name) {
		File file = new File(folder, name);
		boolean fileCreated = false;

		if (!file.exists()) {
			try {
				fileCreated = file.createNewFile();
				if (fileCreated) {
					return file;
				} else {
					return null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return file;
	}

	public static File writeOnFile(File file, String content) {
		try {
			FileWriter writer = new FileWriter(file);
			writer.append(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

}
