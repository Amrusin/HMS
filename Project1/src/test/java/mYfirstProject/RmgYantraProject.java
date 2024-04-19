package mYfirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RmgYantraProject {

	public static void main(String[] args) throws InterruptedException, SQLException {
		// TODO Auto-generated method stub
Random ran=new Random();
int random=ran.nextInt(500);

String expData="TY_HMSPRO"+random;

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		Thread.sleep(2000);
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("projectName")).sendKeys("TY_HMSPRO");
		driver.findElement(By.name("createdBy")).sendKeys("Vijayalakshmi");
		Thread.sleep(2000);
		WebElement selec = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
		Select s=new Select(selec);
		Thread.sleep(1000);
		s.selectByValue("Created");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%","root");
		Statement state=con.createStatement();
		String query="select * from project where lower(project_name)='"+expData+"';";
		
		ResultSet result=state.executeQuery(query);
		System.out.println(result.getMetaData()); //To see the column name
		
		while(result.next())
		{
			String actual=result.getString(4);
			
			if(actual.equals(expData))
			{
				System.out.println("data is present");
			}
			else
			{
				System.out.println("data is not present");
			}
		}
	}

}
