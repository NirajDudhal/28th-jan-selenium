package mumbai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ep14 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");

        WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
        mobileNumber.sendKeys("1234567890");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("mypassword");

        Select dayDropdown = new Select(driver.findElement(By.id("day")));
        dayDropdown.selectByValue("10");

        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        monthDropdown.selectByVisibleText("Feb");

        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        yearDropdown.selectByValue("1990");

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        genderRadioButton.click();

        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

        driver.quit();
    }
}
