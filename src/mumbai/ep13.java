package mumbai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ep13 {
    public WebDriver driver;

    @FindBy(xpath = "${facebook.signup.button.xpath}")
    public WebElement signUpButton;

    @FindBy(id = "${facebook.month.dropdown.id}")
    public WebElement monthDropdown;

    public void FacebookSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void selectMonth(String month) {
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("9");
    }

    public String getSelectedMonth() {
        Select monthSelect = new Select(monthDropdown);
        return monthSelect.getFirstSelectedOption().getText();
    }
}
