package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep4
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("http://the-internet.herokuapp.com/iframe");
	  d.manage().window().maximize();
	  d.switchTo().frame("Rich Text Area");
	  d.findElement(By.xpath("//p[text()='Your content goes here.']")).sendKeys("instant khichadi");
	  Thread.sleep(3000);
	  d.findElement(By.xpath("(//span[@class=\"tox-icon tox-tbtn__icon-wrap\"])[5]")).click();
	  d.switchTo().parentFrame();
	  d.quit();
	
  }
}
