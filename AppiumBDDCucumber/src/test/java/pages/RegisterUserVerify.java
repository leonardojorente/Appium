package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterUserVerify {
    private AppiumDriver driver;
    public RegisterUserVerify(AppiumDriver driver){this.driver = driver;}

    public RegisterUserVerify checkNameValue(String name){
        WebElement result = driver.findElement(By.id("io.selendroid.testapp:id/label_name_data")) ;
        Assert.assertEquals(result.getText(),name);
        return this;
    }

}
