import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {
	public static void main(String[] args) {
		String path = "E:\\Selenium Components\\geckodriver.exe";
		System.setProperty("webdriver.firefox.marionette", path);
		FirefoxDriver driver = new FirefoxDriver();
	}

}
