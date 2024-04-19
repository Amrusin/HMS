package GenericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	public void switchWindow(WebDriver driver, String url)
	{
		Set<String> wid = driver.getWindowHandles();
		for(String str:wid)
		{
			driver.switchTo().window(str);
			String data = driver.getCurrentUrl();
			if(data.contains(url))
			{
				break;
			}
		}
	}
}
