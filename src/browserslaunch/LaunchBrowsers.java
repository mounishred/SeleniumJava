package browserslaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		
	//	WebDriver driver = new ChromeDriver();
	//	ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();  // Selenium 4 
		// driver.manage().window().fullscreen();  // Selenium 4
		driver.close();
		driver.quit();
		
	}

}
