package Practise;

import org.testng.annotations.Test;

public class ReadDataFromExcelTest {
	
	@Test(dataProviderClass=ReadDataFromExcelClass.class,dataProvider="SignupReadDataExcel")
	public void testScriptSignup(String fname,String address,String city, String email, String pass,String Cpass) {
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/hms/registration.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SignUpAsPatientPage sp=new SignUpAsPatientPage(driver);
		sp.SignUpPatientPage(driver, fname, address, city, email, pass, Cpass);*/
		System.out.println("name---"+fname+"---"+address+"---"+city+"---"+email+"---"+pass+"---"+Cpass);
	}
}
