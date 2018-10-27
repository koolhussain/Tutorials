import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTitleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expected Title");
		String etitle = scan.next();
		String url = "http://www.gmail.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String atitle = driver.getTitle();
		driver.close();
		System.out.println("The Expected Title is: " + etitle);
		System.out.println("The Actual Title is: " + atitle);
		if (etitle.equalsIgnoreCase(atitle)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}
}
