package capture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteAutomationExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.w3school.com/js/tryit.asp?filename=tryjs_myfirst");

        // Locate and interact with an element on the page
        WebElement buttonElement = driver.findElement(By.xpath("//button[@id='myButton']"));
        buttonElement.click();

        // Perform other actions on the website
        WebElement inputElement = driver.findElement(By.xpath("//input[@name='username']"));
        inputElement.sendKeys("John Doe");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement resultElement = driver.findElement(By.xpath("//div[@id='result']"));
        String resultText = resultElement.getText();
        System.out.println("Result: " + resultText);

        // Close the browser
        driver.quit();
    }
}
