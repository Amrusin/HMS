package mYfirstProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();

List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
System.out.println(allLinks.size());
for(WebElement eachLink:allLinks)
{
	
	
	String link = eachLink.getAttribute("href");
	try {
	URL url=new URL(link);
	HttpURLConnection httpCon=(HttpURLConnection) url.openConnection();
	int StatusCode=0;
	StatusCode=httpCon.getResponseCode();
	if(StatusCode>=400 && StatusCode!=0)
	{
		System.out.println(link+"----->"+StatusCode);
	}
	}

	catch(Exception e)
	{
	
	}

}
driver.quit();
	}
	

}
	
