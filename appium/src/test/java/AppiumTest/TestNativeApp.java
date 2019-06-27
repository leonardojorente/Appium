package AppiumTest;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;
import support.NativeApp;
import java.net.MalformedURLException;


public class TestNativeApp {
    //open http://selendroid.io/ -> getting started -> application under test ->download selendroid-app.test
    //Criar um diretorio "App" dentro do projeto e colar o apk
    private AndroidDriver driver;

    @Before
    //chama o metodo createApp da classe NativeApp
    public void setUP() throws MalformedURLException { driver = NativeApp.createApp();}


    @Test
    public void testAdicionarNovoUsuario() {
    new MainPage(driver)
        .ClickRegisterButton()
        .typeUserName("Leo")
        .typeEmail("teste@gmail.com")
        .typePassword("password")
        .typeName("Leonardo")
        .selectProgrammingLanguage()
        .clickLanguageButton("Python")
        .checkAcceptAdds()
        .clickRegisterUserButton()
        .checkNameValue("Leonardo");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
