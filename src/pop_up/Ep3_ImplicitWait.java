package pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ep3_ImplicitWait
{
public static void main(String[] args)
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//click on create new acc link
driver.findElement(By.xpath("//a[text()='Create newaccount']")).click();
//enter FN
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
driver.close();
}
}