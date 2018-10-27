import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomationChrome {

	public static void main(String[] args) throws Exception {
		
		String url = "http://www.facebook.com";
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
		
	}

}
