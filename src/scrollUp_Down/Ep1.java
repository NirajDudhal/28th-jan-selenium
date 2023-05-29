package scrollUp_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1 
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("http://www.facebook.com/");
	  d.manage().window().maximize();
	  Thread.sleep(2000);
	  ((JavascriptExecutor)d).executeScript("window.scrollBy(0,350)");
	  ((JavascriptExecutor)d).executeScript("window.scrollBy(0,-100)");
	  Thread.sleep(2000);
	  d.quit();
  }
}
