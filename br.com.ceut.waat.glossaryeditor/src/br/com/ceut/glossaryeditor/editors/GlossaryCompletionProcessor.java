package br.com.ceut.glossaryeditor.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class GlossaryCompletionProcessor implements IContentAssistProcessor {

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {

		IDocument document = viewer.getDocument();
		String lastWord = lastWord(document, offset);

		ArrayList<CompletionProposal> results = new ArrayList<CompletionProposal>();

		for (int i = 0; i < Parser.KEYWORDS.length; i++) {
			if (Parser.KEYWORDS[i].startsWith(lastWord)) {
				results.add(new CompletionProposal(Parser.KEYWORDS[i],
						(offset - lastWord.length()), lastWord.length(),
						Parser.KEYWORDS[i].length()));
			}

		}

		return (ICompletionProposal[]) results
				.toArray(new ICompletionProposal[results.size()]);

	}

	private String lastWord(IDocument document, int offset) {
		for (int i = offset - 1; i >= 0; i--) {
			try {
				char c = document.getChar(i);
				if (Character.isJavaIdentifierPart(c) && i == 0) {
					return document.get(i, offset - i);
				} else if (!Character.isJavaIdentifierPart(c)) {
					return document.get(i + 1, offset - (i + 1));
				}

			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		return new IContextInformation[0];
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

}
