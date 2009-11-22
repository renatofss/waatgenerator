package br.com.ceut.waat.menu.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.com.ceut.waat.interfaces.UiInterpreter;
import br.com.ceut.waat.menu.Test;
import br.com.ceut.waat.menu.facades.FileManipulationFacade;
import br.com.ceut.waat.menu.facades.WaatEngineFacade;
import br.com.ceut.waat.menu.facades.WorkbenchFacade;

public class InterfacesHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		File file = WorkbenchFacade.getFileFromActiveEditor(window);
		IFile eclipseFile = WorkbenchFacade
				.getEclipseFileFromActiveEditor(window);

		boolean saved = WorkbenchFacade.confirmAndSaveAllEditors(window);

		if (saved) {
			String fileContent = FileManipulationFacade.readFileContent(file);

			String xml = UiInterpreter.getInstance().parseToXML(fileContent);
			
			File XMLFile = WaatEngineFacade.createXMLInterfaceFile(xml);
			WaatEngineFacade.generateInterface(XMLFile);

			WorkbenchFacade.refreshFileProject(eclipseFile);

		} else {
			MessageDialog.openInformation(window.getShell(), "Alerta",
					"Você deve salvar os arquivos antes de prosseguir.");
		}

		return null;
	}

}
