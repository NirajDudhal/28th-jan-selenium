package capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ep1_Screenshot
{
 public static void main(String[]args) throws IOException
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.amazon.in/");
	 File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	 System.out.println(s);
	 File dest=new  File("C:\\Users\\niraj\\OneDrive\\Pictures\\Screenshots\\nyk.jpg");
	 
	 FileHandler.copy(s, dest);
 }
}
//img[@alt="LG ScaLGo Descaling Powder for Washing Machines 100 g (Pack of 3)"]