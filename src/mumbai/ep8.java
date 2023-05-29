package mumbai;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep8
{
	public static void main(String[]args)
	{
		WebDriver d=new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/");
		
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("njk");
	
		d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("123456");
	}
}



