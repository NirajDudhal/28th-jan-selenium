package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep2 
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
	  d.switchTo().frame(3);
	  d.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("babuji");
	  System.out.println("text=babuji");
	  Thread.sleep(3000);
	  d.switchTo().parentFrame();
	  d.quit();
  }
}
