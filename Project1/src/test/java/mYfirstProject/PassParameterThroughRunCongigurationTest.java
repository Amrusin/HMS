package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PassParameterThroughRunCongigurationTest {
  @Test
  public void ReadParameter() {
	  WebDriver driver=null;
	  String BROWSER = System.getProperty("browser");
	  String URL = System.getProperty("url");
	 /* String USERNAME = System.getProperty("username");
	  String PASSWORD = System.getProperty("password");*/
	  
	  System.out.println(BROWSER);
	  System.out.println(URL);
	 /* System.out.println(USERNAME);
	  System.out.println(PASSWORD);*/
	  
	  if(BROWSER.equalsIgnoreCase("chrome"))
      {
      	driver=new ChromeDriver();
      }
      else if (BROWSER.equalsIgnoreCase("firefox")) 
      {
      	driver=new FirefoxDriver();
			
		}
      else
      {
      	System.out.println("--Invalid Browsers--");
      }
	  driver.get(URL);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //driver.findElement(By.name("user_name")).sendKeys(USERNAME);
     // driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
     
     // driver.findElement(By.id("submitButton")).click();
      driver.quit();
  }
}
