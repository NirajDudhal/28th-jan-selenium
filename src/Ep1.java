import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep1
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.nykaa.com");
	  WebElement searchbox= driver.findElement(By.id("headersearch"));
	  searchbox.sendKeys("bra");
	  searchbox.sendKeys(Keys.ENTER);
	  Thread.sleep(4000);
	  driver.quit();
  }
}
