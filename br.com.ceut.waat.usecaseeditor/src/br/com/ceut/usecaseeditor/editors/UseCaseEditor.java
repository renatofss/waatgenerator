package br.com.ceut.usecaseeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class UseCaseEditor extends TextEditor {

	public UseCaseEditor() {
		super();
		setSourceViewerConfiguration( new UseCaseConfiguration() );
	}

}
