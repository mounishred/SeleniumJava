package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GitHub {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Selenium with GitHub");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
