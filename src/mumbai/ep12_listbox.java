 package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ep12_listbox 
{
  public static void main(String[]args) throws InterruptedException 
  {
	  WebDriver d=new ChromeDriver();
	  d.get("http://www.facebook.com/");
	  d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	  Thread.sleep(3000);
	  WebElement month=d.findElement(By.xpath("//select[@id='month']"));
	  
	Select s=new Select(month);
	  //s.selectByVisibleText("Feb");
	 // s.selectByValue("4");
	 s.selectByIndex(6);
  }
}
