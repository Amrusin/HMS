package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketPlayersNameAlongwithScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/78635/ind-vs-eng-2nd-test-england-tour-of-india-2024");
	    java.util.List<WebElement> allPlayers = driver.findElements(By.xpath("//span[text()='England 2nd Innings']/../../div/div[1]/a"));
	    java.util.List<WebElement> allRuns = driver.findElements(By.xpath("//span[text()='England 2nd Innings']/../../div/div[1]/a/../../div[3]"));
	    List<WebElement> allPlayers2 = driver.findElements(By.xpath("//span[text()='England 2nd Innings']/../../div/div[1]/a/../../div[2]/span"));
	    for(int i=0; i<allPlayers.size();i++)
	    {
	    	String Player=allPlayers.get(i).getText();
	    	String runs=allRuns.get(i).getText();
	    	String Players2=allPlayers2.get(i).getText();
	    	System.out.println(Player +":" + "Followed by" +"------"+ Players2 + "-----"+runs +":" );
	    }
		driver.quit();
	}
	
}
