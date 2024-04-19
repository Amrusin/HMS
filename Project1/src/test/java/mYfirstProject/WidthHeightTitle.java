package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthHeightTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.com/");                                 // get
		String Title=driver.getTitle();   
		System.out.println( );                                                   //get Title
		System.out.println("************* Title is:   "+ Title);
		System.out.println();
		String currurl=driver.getCurrentUrl();   
		System.out.println();                                                     //getCurrentUrl
		System.out.println("$$$$$$$$$$$ Current URL is:    " +currurl );
		System.out.println();
		String psrc=driver.getPageSource();                                    //getPageSource
		System.out.println();
		System.out.println("***********PageSource is:"    +psrc  );
		System.out.println();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));      //timeouts

		Options options=driver.manage();                                        //options
		Window window=options.window();                                         //window
		window.maximize();                                                      //maximize

		driver.manage().deleteAllCookies();                                     //cookies


		Dimension size = driver.manage().window().getSize();                    //getSize
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Current height:"+ height);
		System.out.println();
		System.out.println("Current width:"+width);
		System.out.println();
		Dimension newDimension=new Dimension(1000,800);
		driver.manage().window().setSize(newDimension);                        //setSize

		Dimension newSetDimension = driver.manage().window().getSize();         //printinggetsize
		int newHeight = newSetDimension.getHeight();
		int newWidth = newSetDimension.getWidth();
		System.out.println("Current height:"+ newHeight);
		System.out.println();
		System.out.println("Current width:"+newWidth);


		Point position = driver.manage().window().getPosition(); 
		System.out.println();//getPosition
		System.out.println("x" +position.x);
		System.out.println();
		System.out.println("y" +position.y);

		driver.manage().window().setPosition(new Point(100,200));                //setposition

		                     
		driver.navigate().to("https://www.google.com/");                           //Navigate
		Thread.sleep(2000);
		driver.navigate().back();                                                  //back
		Thread.sleep(2000);
		driver.navigate().forward();                                                //forward
		Thread.sleep(2000);
		driver.navigate().refresh();                                                //refresh

		driver.manage().window().minimize();                                         //minimize
		driver.manage().window().fullscreen();                                       //fullscreen     
			driver.quit();                                                            //quit
			}

}
