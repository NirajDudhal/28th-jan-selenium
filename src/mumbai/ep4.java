package mumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.WebDriver.Options;

public class ep4 
{
  public static void main(String[]args)
  {
	  WebDriver d=new ChromeDriver();
	  d.get("http://www.google.com");
	  
	d.manage().window().maximize();  
  }
}
