package webPages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultSearchPage {
    private AndroidDriver driver;
    public ResultSearchPage (AndroidDriver driver){this.driver = driver;}

        public ResultSearchPage checkValue(String name){
            WebElement result = driver.findElement(By.id("tw-source-text-ta"));
            Assert.assertEquals(result.getText(),name);
            return this;
        }
    }