package Practise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNameAlongWithPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lst= new ArrayList();
		lst.add("Apple iPhone 15 (128 GB) - Black");
		lst.add("Apple iPhone 13 (128GB) - Blue");
		lst.add("Apple iPhone 13 (128GB) - Blue");
		lst.add("Apple iPhone 15 (128 GB) - Blue");
		lst.add("Apple iPhone 13 (128GB) - Midnight");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone&crid=153K9SL8VDN17&sprefix=iphone%2Caps%2C645&ref=nb_sb_noss_1");
		
		for(String products: lst)
		{
			String x="//span[text()='"+products+"']/../../../..//descendant::span[@class='a-price']";
			String price= driver.findElement(By.xpath(x)).getText();
			System.out.println(products+"---->"+price);
		}
	}

}
//::div[@class='a-section a-spacing-small a-spacing-top-small']