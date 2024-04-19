
package mYfirstProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommoData.properties");
Properties p=new Properties();
p.load(fis);

p.setProperty("bhggg", "chrome");
p.setProperty("url", "www.google.com");
p.setProperty("username", "admin1");
p.setProperty("password", "admin1");

FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\CommoData.properties");

p.store(fos, "Second data");
	}

}

