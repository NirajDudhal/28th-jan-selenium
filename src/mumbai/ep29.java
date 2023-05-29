package mumbai;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ep29 
{
	
	
	 public static void main(String[]args) throws IOException
	 {
		 WebDriver d=new FirefoxDriver();
		 d.manage().window().maximize();
		 d.get("http://www.google.com/");
		 File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 System.out.println(s);
		 File des=new File("C:\\Users\\niraj\\OneDrive\\Pictures\\Screenshots\\g.jpg");
		 FileHandler.copy(s, des);
		 d.close();
		 
	 }
	}


