package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class timeFormatScreenshot {
	
	WebDriver driver;
	
	public void Screenshot() throws IOException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy_MMM_dd hh_mm_ss");
		Date date = new Date(0);
		String time = dateFormat.format(date);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("/Users/mounishreddyparlapalli/eclipse-workspace/SeleniumJava/Screenshots" + time +".png"));
		
	}
	
  @Test
  public void f()  throws Exception{
	  
	  driver.get("https://www.flipkart.com");
	  Thread.sleep(5000);
	  Thread.sleep(2000);
	  Screenshot();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new SafariDriver();
	  driver.manage().window().maximize();
  }

}
