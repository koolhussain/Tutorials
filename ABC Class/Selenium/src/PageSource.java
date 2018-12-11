import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		String pg = driver.getPageSource();
		driver.close();
		System.out.println(pg);
	}
}
