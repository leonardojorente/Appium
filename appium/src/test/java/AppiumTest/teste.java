package AppiumTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class teste {
    //open http://selendroid.io/ -> getting started -> application under test ->download selendroid-app.test
    //Criar um diretorio "App" dentro do projeto e colar o apk
    public static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        //File app = new File(("C:\\Users\\l.jorente.CORP\\IdeaProjects\\appium\\App\\selendroid-test-app-0.17.0.apk"));
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

        //usado para instalar a aplicação no device e rodar
        //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        //usado para dar launch em uma aplicação já instalada no device
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.kidshome");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".start.ui.StartActivity");

        //comando pelo prompt para ver qual aplicaçaõ está rodando e pegar a activity e usá-la, caso necessário
        //adb shell
        //dumpsys window windows | grep -E 'mCurrentFocus'

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Thread.sleep(1000);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/setup_wizard_intro_next_button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(500);
        driver.findElement(By.id("com.sec.android.app.kidshome:id/pin_button_0")).click();
        Thread.sleep(4000);

        //driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='6']")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@content-desc,'Browser')]")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}
