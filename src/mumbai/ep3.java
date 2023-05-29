package mumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep3 
{
  public static void main(String[]args)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.facebook.com/");
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
  }
}
