 package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	 d.switchTo().frame("iframeResult");
	 d.findElement(By.xpath("//input[@value=\"John\"]")).sendKeys("java");
	 System.out.println("text sent:java");
	 Thread.sleep(3000);
	 d.switchTo().parentFrame();
	 
	 d.quit();
	 
 }
}
