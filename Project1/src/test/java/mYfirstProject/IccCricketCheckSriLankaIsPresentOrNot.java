package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketCheckSriLankaIsPresentOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String Expected="Sri Lanka";
Thread.sleep(1000);
driver.manage().deleteAllCookies();
List<WebElement> team = driver.findElements(By.xpath("//h3[@class='si-team-name']/span[@class='si-fname si-text']"));
	System.out.println(team.size());
	Thread.sleep(1000);
	for(WebElement EachTeam:team)
	{ 
		String data = EachTeam.getText();
		Thread.sleep(1000);
		//System.out.println(data);
	
		if(Expected.equalsIgnoreCase(data))
		{
			System.out.println("SriLanka is Present");
			
		}
		else
		{
			System.out.println("SriLanka is not Present");
		}
	}
	
	}

}
