package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ProgrammingLanguagePopUpPage {
    private AppiumDriver driver;

    public ProgrammingLanguagePopUpPage(AppiumDriver driver){this.driver = driver;}

    public RegisterUserPage clickLanguageButton(String language){
        driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'"+language+"')]")).click();
        return new RegisterUserPage(driver);
    }

}
