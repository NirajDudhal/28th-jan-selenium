package capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep4 
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d= new FirefoxDriver();
	  d.manage().window().maximize();
	  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  d.switchTo().frame("iframeResult");
	  d.findElement(By.xpath("//button[@onclick=\"document.getElementById('demo').innerHTML = Date()\"]")).click();
	  d.switchTo().parentFrame();
	  Thread.sleep(4000);
	  d.close();
  }
}
