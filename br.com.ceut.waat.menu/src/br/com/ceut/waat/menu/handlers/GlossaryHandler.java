package br.com.ceut.waat.menu.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.com.ceut.waat.menu.facades.FileManipulationFacade;
import br.com.ceut.waat.menu.facades.WaatEngineFacade;
import br.com.ceut.waat.menu.facades.WorkbenchFacade;

public class GlossaryHandler extends AbstractHandler {

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

			File XMLFile = WaatEngineFacade.createXMLGlossaryFile(fileContent);

			WorkbenchFacade.refreshFileProject(eclipseFile);

		} else {
			MessageDialog.openInformation(window.getShell(), "Alerta",
					"Você deve salvar os arquivos antes de prosseguir.");
		}

		return null;
	}

}
