package mYfirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcecuteTheScriptWithoutOpeningTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--headless");//("--incognito")
WebDriver driver=new ChromeDriver(option);
driver.get("https://www.amazon.in/");
System.out.println(driver.getCurrentUrl());

	}

}
