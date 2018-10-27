import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAutomationFirefox {

	public static void main(String[] args) throws Exception {
		String url = "http:\\www.facebook.com";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
		
	}

}
