import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "http://www.gmail.com";
		driver.get(url);
		String currenturl = driver.getCurrentUrl();
		String pagesource = driver.getPageSource();
		driver.close();
		System.out.println(currenturl);
		System.out.println(pagesource);
	}
}
