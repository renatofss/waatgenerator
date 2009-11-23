package br.com.ceut.waat.testgenerator;

public enum Templates {
	
	CHECK_ID("browser.check(\"id=CHECK_ID\");" + "\n"),
	
	CLICK_ID("browser.click(\"id=CLICK_ID_ELEMENTID\");" + "\n"),
	
	SELECT_ID("String[] genderOptions = browser.getSelectOptions(\"id=SELECT_ID\");" + "\n" +
				"browser.select(\"id=SELECT_ID\", \"id=\" + genderOptions[0]);" + "\n"),
	
	TEST_TEMPLATE("import junit.framework.TestCase;" + "\n" +
					"import com.thoughtworks.selenium.*;" + "\n" +
					"public class TEST_CLASS_NAMETest extends TestCase {" + "\n" + 
					"private static final String BROWSER_FIREFOX = \"*firefox\";" + "\n" + 
					"private static final String BROWSER_CHROME = \"*chrome\";" + "\n" +
					"private static final String BROWSER_INTERNET_EXPLORER = \"*iexplore\";" + "\n" +
					"private static final String BROWSER_SAFARI = \"*safari\";" + "\n" +
					"private static final String BROWSER_OPERA = \"*opera\";" + "\n" +
					"private Selenium browser;" + "\n" +
					"public void setUp() {" + "\n" +
					"browser = new DefaultSelenium(\"localhost\", 4444, BROWSER_FIREFOX, \"TEST_TEMPLATE_DAFAULT_URL\");" + "\n" +
					"browser.start();" + "\n" +
					"}" + "\n" +
					"public void testTEST_METHOD_NAME(){" + "\n" +
					"TEST_TEMPLATE_TESTS" + "\n" +
					"}" + "\n" +
					"public void tearDown() {" + "\n" +
					"browser.stop();" + "\n" +
					"}" + "\n" +
					"}" + "\n"
				),
				
	TYPE_ID("browser.type(\"id=TYPE_ID\", \"TYPE_VALUE\");" + "\n");
	
	
	
	private String template;
	
	private Templates(String template) {
		this.template = template;
	}
	
	public String toString() {
		return this.template;
	}
	
}
