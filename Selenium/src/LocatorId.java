import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {
	public static void main(String[] args) throws Exception {
		String url = "http://www.facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("using id");
		WebElement email2 = driver.findElement(By.name("email"));
		email.sendKeys("using name");
		WebElement email3 = driver.findElement(By.className("inputtext"));
		email.sendKeys("using className");
		Thread.sleep(5000);
		driver.close();
	}
}
