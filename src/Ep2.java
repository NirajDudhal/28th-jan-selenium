import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ep2 
{
	public static void main(String[]args)
	{
		 WebDriver d= new ChromeDriver();
		 
		 d.get("http://www.google.com/");
		 d.findElement(By.xpath("//button[@jsaction='click:lj3vef']")).click();
		 d.close();
	}
 
  
}
