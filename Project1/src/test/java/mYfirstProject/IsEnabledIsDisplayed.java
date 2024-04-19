package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		String a = driver.getTitle();
		System.out.println(a);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='u_0_0_l/']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("u_c_b_ED")).sendKeys("abc");
		driver.findElement(By.id("u_c_d_bA")).sendKeys("xyz");
		driver.findElement(By.id("u_c_g_eA")).sendKeys("2356487965");
		driver.findElement(By.id("password_step_input")).sendKeys("Am@12345");
		String expectedTitle="Facebook – log in or sign up";   
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("unsuccesfull");
		}
		
	WebElement enabled = driver.findElement(By.xpath("//label[text()='Female']"));
	enabled.click();
	if(enabled.isEnabled())
	{
		System.out.println("Radio button is enabled");
	}
	else
	{
		System.out.println("Radio button is not enabled");
	}
	WebElement submit = driver.findElement(By.id("u_7_s_js"));
	if(submit.isDisplayed())
	{
		System.out.println("visible");
	}
	else
	{
		System.out.println("Invisible");
	}
	if(enabled.isSelected())
	{
		System.out.println("Radio button is selected");
	}
	else
	{
		System.out.println("Radio button is not selected");
	}

	}

}
