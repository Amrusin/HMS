package mYfirstProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenTestingSimple {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
        Properties p = new Properties();
        p.load(fis);
        
        String BROWSER = p.getProperty("browser");
        String URL = p.getProperty("url");
        String EMAIL = p.getProperty("Email");
        String PASSWORD = p.getProperty("Password");
        String CPWD = p.getProperty("ConfirmPassword");
        //driver.findElement(By.xpath("//button[text()='Press Enter to Submit']")).click();
        
        System.out.println(BROWSER);
        System.out.println(URL);
        System.out.println(EMAIL);
        System.out.println(PASSWORD);
        System.out.println(CPWD);
        
        
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
        driver.findElement(By.id("email")).sendKeys(EMAIL);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("confirmPassword")).sendKeys(CPWD);
        driver.findElement(By.xpath("//button[text()='Press Enter to Submit']")).click();
        driver.quit();
	}

}
