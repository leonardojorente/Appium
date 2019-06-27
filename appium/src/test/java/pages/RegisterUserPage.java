package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RegisterUserPage {
    private AppiumDriver driver;

    public RegisterUserPage(AppiumDriver driver){this.driver = driver;}
    public RegisterUserPage typeUserName(String username){
        driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'inputUsername')]")).sendKeys(username);
        return this;
    }
    public RegisterUserPage typeEmail(String email){
        driver.findElement(By.xpath("//android.widget.EditText[contains(@content-desc,'email')]")).sendKeys(email);
        return this;
    }
    public RegisterUserPage typePassword(String password){
        driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys(password);
        return this;
    }
    public RegisterUserPage typeName(String name){
        driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
        driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys(name);
        return this;
    }
    public ProgrammingLanguagePopUpPage selectProgrammingLanguage(){
        driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
        return new ProgrammingLanguagePopUpPage(driver);
    }
    public RegisterUserPage checkAcceptAdds(){
        driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
        return this;
    }
    public RegisterUserVerify clickRegisterUserButton(){
        driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
        return new RegisterUserVerify(driver);
    }

}
