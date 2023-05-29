package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep2_alert 
{
 public static void main(String[]args) throws InterruptedException 
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://demo.guru99.com/test/delete_customer.php");
	 d.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("shriman shrimati");
	 d.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	 String text=d.switchTo().alert().getText();
	 System.out.println(text);
	 Thread.sleep(3000);
	 d.switchTo().alert().accept();
	 Thread.sleep(2000);
	 d.switchTo().alert().accept();
	 d.close();
	 
 }
}
