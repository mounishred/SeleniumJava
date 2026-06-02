package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.x.com");
			driver.navigate().to("https://www.facebook.com");
			
			driver.navigate().back();
			
			driver.navigate().forward();
		
			driver.navigate().refresh();
	}

}
