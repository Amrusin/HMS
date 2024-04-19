package Practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.HospitalManagementRepository.PatientLoginPage;
import com.HospitalManagementRepository.SignUpAsPatientPage;

public class DataProviderLoginScriptTest {
	 WebDriver driver=new ChromeDriver();
		@Test(dataProviderClass=DataProviderLoginClass.class,dataProvider="Login")
				  public void testScript(String usrname,String password) 
				  {
					  System.out.println("name---"+usrname+"---password---"+password);
					 
					  driver.get("http://rmgtestingserver/domain/Hospital_Management_System/hms/user-login.php");
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						PatientLoginPage pl=new PatientLoginPage(driver);
						pl.PatientLognPage(usrname, password);
						
						
				  }
		
				
			}
	


