import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCrome {
	public static void main(String[] args) {
		String path = "E:\\Selenium Components\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		ChromeDriver driver = new ChromeDriver();
	}
}
