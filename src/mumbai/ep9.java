package mumbai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ep9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");

        // Click on the 'Create New Account' button
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

       driver.findElement(By.xpath("//input[@name='lastname']"));

        // Enter the first name and last name
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");

        driver.quit();
    }
}