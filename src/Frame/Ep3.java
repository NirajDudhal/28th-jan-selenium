package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep3 
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
	  d.manage().window().maximize();
	  d.switchTo().frame("iframeResult");
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("parminder");
	  d.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("sandhya devi");
	  d.switchTo().parentFrame();
	  d.quit();
	  
  }
}
