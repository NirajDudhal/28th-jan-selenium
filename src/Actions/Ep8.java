package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ep8
{
 public static void main(String[]args) throws InterruptedException
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("http://www.facebook.com/");
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 //step1:
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 //step2:
	 Actions act=new Actions(driver);
	 //step3:
	 act.click(month).perform();
	 Thread.sleep(2000);
	 //navigate to 1st option using "Home" key
	 act.sendKeys(Keys.HOME).perform();
	 Thread.sleep(2000);
	 //step navigate to OCT option using "Arrow_Down" key
	 for(int i=1; i<=9; i++)
	 {
	 act.sendKeys(Keys.ARROW_DOWN).perform();
	 Thread.sleep(1000);
	 }
	 //step4C: select option using "Enter" Key
	 act.sendKeys(Keys.ENTER).perform();
	 driver.quit();

 }
}
