package capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ep2_Switch_to_Frame
{
 public static void main(String[]args) throws InterruptedException
 {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	d.switchTo().frame("iframeResult");
	d.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("my");
	System.out.println("text sent:my");
	d.switchTo().parentFrame();
	Thread.sleep(3000);
	d.close();
 }	
}