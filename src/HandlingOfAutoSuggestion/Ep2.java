package HandlingOfAutoSuggestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep2
{
  public static void main(String[]args)
  {
	  WebDriver d=new FirefoxDriver();
	  d.navigate().to("https://www.google.com/");
	  d.navigate().to("http://facebook.com");
	  d.navigate().back();
	  d.navigate().forward();
	  d.navigate().refresh();
	  d.quit();
  }
}
