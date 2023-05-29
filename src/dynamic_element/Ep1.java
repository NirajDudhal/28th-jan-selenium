package dynamic_element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("https://www.flipkart.com/");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	  d.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("redmi 9 power");
	  d.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	  Thread.sleep(4000);
	  String review=d.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[8]")).getText();
	  System.out.println(review);
	  d.quit();
	  
  }
}
