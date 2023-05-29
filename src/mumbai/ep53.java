package mumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ep53 
 {
  public static void main(String[]args)
  {
	  WebDriver d=new ChromeDriver();
	  
	  d.navigate().to("http://www.google.com");
	  
	  d.navigate().to("http://www.twitter.com");
	  
	  d.navigate().back();
	  
	  d.navigate().forward();
	  
	  d.navigate().refresh();
	  
  }
}
