package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep7
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.facebook.com/");
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 d.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	 WebElement month=d.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	 Actions act=new Actions(d);
	 act.click(month).perform();
	 System.out.println("clicked on month drop");
	 Thread.sleep(2000);
	 act.sendKeys(Keys.HOME).perform();
	 System.out.println("pressed home key");
	 for(int i=1;i<=8;i++)
	 {
	 act.sendKeys(Keys.ARROW_DOWN).perform();
	 System.out.println("pressed arrow down key");
	 Thread.sleep(2000);
	 }
	 act.sendKeys(Keys.ENTER).perform();
	 System.out.println("presssed enter key");
	 
 }
}
