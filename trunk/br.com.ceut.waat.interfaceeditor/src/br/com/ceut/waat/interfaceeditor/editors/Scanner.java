package br.com.ceut.waat.interfaceeditor.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class Scanner extends RuleBasedScanner {
	public Scanner() {
		WordRule rule = new WordRule(new IWordDetector() {
			public boolean isWordStart(char c) {
				return Character.isJavaIdentifierStart(c);
			}

			public boolean isWordPart(char c) {
				return Character.isJavaIdentifierPart(c);
			}
		});

		ColorManager manager = new ColorManager();

		Token keyword = new Token(new TextAttribute(manager
				.getColor(IEditorColors.KEYWORD), null, SWT.BOLD));

		Token string = new Token(new TextAttribute(manager
				.getColor(IEditorColors.STRING), null, SWT.BOLD));

		// add tokens for each reserved word

		for (int n = 0; n < Parser.KEYWORDS.length; n++) {
			rule.addWord(Parser.KEYWORDS[n], keyword);
		}

		setRules(
				new IRule[] { 
						rule,
						new SingleLineRule("\"", "\"", string, '\\'),
						new WhitespaceRule(new IWhitespaceDetector() {
							public boolean isWhitespace(char c) {
								return Character.isWhitespace(c);
							}
						}
				), });
	}

}
