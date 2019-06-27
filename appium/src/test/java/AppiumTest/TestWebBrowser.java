package AppiumTest;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import support.Web;
import webPages.GooglePage;
import java.net.MalformedURLException;

// para convferir xpath do android mobile chrome://inspect/#devices
//abra a pagina no celular depois atualize a do chrome no desctope onde digitou o site acima

public class TestWebBrowser {
    private AndroidDriver driver;

    @Before
    //chama o metodo createApp da classe NativeApp
    public void setUP() throws MalformedURLException { driver = Web.createChrome();}


    @Test
    public void testAdicionarNovoUsuario() {
        new GooglePage(driver)
                .typeSearch("Hello")
                .clickSearch();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();

    }
}
