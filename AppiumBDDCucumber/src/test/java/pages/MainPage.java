package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainPage{
    private AppiumDriver driver;

    //construtor da classe
    public MainPage (AppiumDriver driver) {this.driver = driver;}

    public void ClickRegisterButton(){
        driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
    }

}
