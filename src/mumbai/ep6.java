package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep6 
{
  public static void main(String[]args)
  {
	  WebDriver d=new ChromeDriver();
	  
	  d.get("http://www.facebook.com/");
	  d.findElement(By.xpath("//input[@id='email']")).sendKeys("niraj.dudhal");
	  d.findElement(By.xpath("//input[@name='pass']")).sendKeys("404020077");
	  d.findElement(By.xpath("//button[@name='login']")).click();

	  
  }
}
