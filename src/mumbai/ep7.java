package mumbai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ep7 {
  public static void main(String[] args) {
  

    // create a new ChromeDriver instance
    WebDriver driver = new ChromeDriver();
    
 
   
    
    // navigate to the Facebook login page
    driver.get("https://www.facebook.com/");
    
    // enter the username and password
    driver.findElement(By.id("email")).sendKeys("niraj.dudhal");
    driver.findElement(By.id("pass")).sendKeys("404020077");
    
  }
}
