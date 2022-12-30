package testrunner;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;

public class HomePageTestRunner extends Setup{


    @Test
    public void searchAmazon() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        HomePage homePage = new HomePage(driver);
        homePage.selectDropdown();
        Thread.sleep(3000);
        String actual = driver.findElement(By.className("a-color-state")).getText();
        System.out.println(actual);
        String expected = "bag";
        Assert.assertTrue(actual.contains(expected));

    }

}
