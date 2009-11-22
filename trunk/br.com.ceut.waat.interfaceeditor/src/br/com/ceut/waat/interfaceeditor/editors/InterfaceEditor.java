package br.com.ceut.waat.interfaceeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class InterfaceEditor extends TextEditor {

	public InterfaceEditor() {
		super();
		setSourceViewerConfiguration( new InterfaceConfiguration() );
	}

}
