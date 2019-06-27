package webPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class GooglePage {
    private AndroidDriver driver;

    //construtor da classe
    public GooglePage (AndroidDriver driver) {this.driver = driver;}

    public GooglePage typeSearch(String searchname){
        driver.findElement(By.name("q")).sendKeys(searchname);
        return this;
    }

    public ResultSearchPage clickSearch(){
        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/button[2]")).click();
        return new ResultSearchPage(driver);
    }

}

