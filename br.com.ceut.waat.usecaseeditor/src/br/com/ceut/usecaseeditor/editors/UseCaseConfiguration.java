package br.com.ceut.usecaseeditor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;

public class UseCaseConfiguration extends SourceViewerConfiguration {

	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler pr = new PresentationReconciler();
		DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(new Scanner());
		pr.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		pr.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		return pr;
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		final SourceViewer sv = (SourceViewer) sourceViewer;
		sv.appendVerifyKeyListener(new VerifyKeyListener() {
			public void verifyKey(VerifyEvent event) {

				// Check for Ctrl+Spacebar
				if (event.stateMask == SWT.CTRL && event.character == ' ') {

					// Check if source viewer is able to perform operation
					if (sv.canDoOperation(SourceViewer.CONTENTASSIST_PROPOSALS))

						// Perform operation
						sv.doOperation(SourceViewer.CONTENTASSIST_PROPOSALS);

					// Veto this key press to avoid further processing
					event.doit = false;
				}
			}
		});
		ContentAssistant ca = new ContentAssistant();

		IContentAssistProcessor cap = new UseCaseCompletionProcessor();
		ca.enableAutoActivation(true);
		ca.setAutoActivationDelay(500);
		ca.setContentAssistProcessor(cap, IDocument.DEFAULT_CONTENT_TYPE);
		ca.setInformationControlCreator(getInformationControlCreator(sv));
		return ca;
	}

}
