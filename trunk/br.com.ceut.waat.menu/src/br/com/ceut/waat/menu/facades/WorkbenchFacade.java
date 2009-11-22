package br.com.ceut.waat.menu.facades;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

public class WorkbenchFacade {

	public static File getFileFromActiveEditor(IWorkbenchWindow window) {

		IWorkbenchPage page = window.getActivePage();
		File file = null;

		if (page != null) {
			IEditorPart editor = page.getActiveEditor();
			if (editor != null) {
				IFile data = (IFile) editor.getEditorInput().getAdapter(
						IFile.class);
				file = data.getLocation().toFile();
			}
		}

		return file;
	}

	public static IFile getEclipseFileFromActiveEditor(IWorkbenchWindow window) {

		IWorkbenchPage page = window.getActivePage();
		IFile eclipseFile = null;

		if (page != null) {
			IEditorPart editor = page.getActiveEditor();
			if (editor != null) {
				eclipseFile = (IFile) editor.getEditorInput().getAdapter(
						IFile.class);
			}
		}

		return eclipseFile;
	}

	public static boolean confirmAndSaveAllEditors(IWorkbenchWindow window) {
		return window.getActivePage().saveAllEditors(true);
	}

	public static void refreshFileProject(IFile file) {
		try {
			file.getProject().getWorkspace().getRoot().refreshLocal(
					IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
