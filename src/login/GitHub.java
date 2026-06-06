package login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class GitHub {
	WebDriver driver;
  @Test
  public void login() {
	  driver.get("https://www.techlearnlin/admin");
	  driver.findElement(By.name("q")).sendKeys("mounish");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
