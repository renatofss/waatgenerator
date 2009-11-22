package br.com.ceut.glossaryeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class GlossaryEditor extends TextEditor {

	public GlossaryEditor() {
		super();
		setSourceViewerConfiguration( new GlossaryConfiguration() );
	}

}
