package Practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows10Close7thOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Set<String> windowHandles = driver.getWindowHandles();
			int count=0;
			for(String windows:windowHandles)
			{ 
				count++;
				String titles = driver.getTitle();
				System.out.println(titles);
				if(count==7)
				{
					driver.switchTo().window(windows).close();
				}
			}
			}
			}
