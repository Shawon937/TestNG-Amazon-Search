package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "select")
    WebElement dropdown;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTxtBox;




    public void selectDropdown() throws InterruptedException {
        Thread.sleep(3000);
        dropdown.click();
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);
        Thread.sleep(200);

        searchTxtBox.sendKeys("bag");
        Thread.sleep(500);
        searchTxtBox.sendKeys(Keys.ENTER);

    }
}
