package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep15 
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver d=new ChromeDriver();
	d.get("http://www.facebook.com/");
	d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@tabindex=\"0\"]")).sendKeys("kavita");
	Thread.sleep(3000);
	d.findElement(By.name("lastname")).sendKeys("rathod");
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@id=\"u_9_g_yC\"]")).sendKeys("9855496612");
}
}
