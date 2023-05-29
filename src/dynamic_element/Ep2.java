package dynamic_element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep2
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver d=new FirefoxDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  d.get("https://www.flipkart.com/");
	  d.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	  d.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("redmi 9 power");
	  d.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	  Thread.sleep(2000);
	  String rating=d.findElement(By.xpath("((//div[@class=\"_2kHMtA\"\"])[1]//span)[6]")).getText(); 
	  Thread.sleep(2000);
	  System.out.println(rating);
	  d.quit();
  }
}
