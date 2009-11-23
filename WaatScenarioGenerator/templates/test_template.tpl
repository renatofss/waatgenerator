import junit.framework.TestCase;
import com.thoughtworks.selenium.*;

public class TEST_CLASS_NAMETest extends TestCase {

	private static final String BROWSER_FIREFOX = *firefox;
	private static final String BROWSER_CHROME = *chrome;
	private static final String BROWSER_INTERNET_EXPLORER = *iexplore;
	private static final String BROWSER_SAFARI = *safari;
	private static final String BROWSER_OPERA = *opera;

    private Selenium browser;

    public void setUp() {
        browser = new DefaultSelenium("localhost", 4444, BROWSER_FIREFOX,
                "TEST_TEMPLATE_DAFAULT_URL");
        browser.start();
    }

	public void testTEST_METHOD_NAME(){
		TEST_TEMPLATE_TESTS
	}
	
    public void tearDown() {
        browser.stop();
    }
}
