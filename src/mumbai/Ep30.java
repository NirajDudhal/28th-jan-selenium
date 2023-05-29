package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep30 
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.manage().window().maximize();
	 d.get("https://www.facebook.com/");
	 d.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
	 Thread.sleep(4000);
	 d.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Urmilesh");
	 Thread.sleep(4000);
	 d.findElement(By.xpath("(//input[@aria-required=\"true\"])[2]")).sendKeys("basu");
	 Thread.sleep(4000);
	 d.findElement(By.xpath("(//input[@aria-required=\"true\"])[3]")).sendKeys("9856442314");
	 Thread.sleep(4000);
	 d.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("urmilesh@12345");
	 Thread.sleep(4000);
	 d.findElement(By.xpath("//input[@value=\"1\"]")).click();
	 Thread.sleep(4000);
	 d.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _6o _6v\"]")).click();
	 d.quit();
 }
}
