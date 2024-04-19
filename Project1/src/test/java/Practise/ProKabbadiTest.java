package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabbadiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//List<WebElement> allPlayers = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='team-name']/p[text()='Puneri Paltan']"));
		//List<WebElement> play = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data matches-play']/p[@class='count']"));
		List<WebElement> allPlayers = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='team-name']/p"));
		List<WebElement> play = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data matches-play']/p"));
		List<WebElement> won = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data matches-won']/p"));
		List<WebElement> lost = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data matches-lost']/p"));
	    List<WebElement> draw = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data matches-draw']/p"));
	    List<WebElement> score = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data score-diff']/p"));
	    List<WebElement> points = driver.findElements(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]/ancestor::div[@class='layout-wrapper']/descendant::div[@class='table-data points']/p"));
	    for(int i=0;i<allPlayers.size();i++)
	    {
	    	String Player=allPlayers.get(i).getText();
	    	String plays=play.get(i).getText();
	    	String wons=won.get(i).getText();
	    	String losts=lost.get(i).getText();
	    	String draws=draw.get(i).getText();
	    	String tscores=score.get(i).getText();
	    	String tpoints=points.get(i).getText();
	    	System.out.println(Player +":" +"------"+plays + "-----"+wons +"----"+losts+"----"+draws+"----"+tscores+"----"+tpoints );
	    }
	}

}
