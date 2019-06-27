package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import pages.MainPage;
import pages.ProgrammingLanguagePopUpPage;
import pages.RegisterUserPage;
import pages.RegisterUserVerify;
import support.NativeApp;

import java.net.MalformedURLException;
import java.util.List;

public class RegisterUserSteps {
    private AndroidDriver driver;

    MainPage mMainPage;
    RegisterUserPage mRegisterUserPage;
    ProgrammingLanguagePopUpPage mProgrammingLanguagePopUpPage;
    RegisterUserVerify mRegisterUserVerify;

    @Before
    public void setUP() throws MalformedURLException {
        driver = NativeApp.createApp();
        mMainPage = new MainPage(driver);
        mRegisterUserPage = new RegisterUserPage(driver);
        mProgrammingLanguagePopUpPage = new ProgrammingLanguagePopUpPage(driver);
        mRegisterUserVerify = new RegisterUserVerify(driver);
    }

    @Given("^I am on Selendroid-test-app$")
    public void i_am_on() {
    }

    @When("^I select Register button$")
    public void i_select() {
        mMainPage.ClickRegisterButton();
    }

    @And("^fill the Username as \"([^\"]*)\"$")
    public void fill_the_Username_as(String username)  {
        mRegisterUserPage.typeUserName(username);
    }

    @And("^fill the E-mail as \"([^\"]*)\"$")
    public void fill_the_E_mail(String email) {
        mRegisterUserPage.typeEmail(email);
    }

    @And("^fill the password as \"([^\"]*)\"$")
    public void fill_the_password(String password)  {
        mRegisterUserPage.typePassword(password);
    }

    @And("^fill the name as \"([^\"]*)\"$")
    public void fill_the_name(String name){
        mRegisterUserPage.typeName(name);
    }

    @And("^select the programming language as$")
    public void select_the_programming_language_as_from_dropdown(List<String> languageList){
        String language = languageList.get(2);
        System.out.println("language selected is: "+language);

        mRegisterUserPage.selectProgrammingLanguage();
        mProgrammingLanguagePopUpPage.clickLanguageButton(language);
    }

    @And("^check the checkbox$")
    public void check_the_checkbox()  {
        mRegisterUserPage.checkAcceptAdds();
    }

    @And("^click Register User button$")
    public void click_Register_User_button()  {
        mRegisterUserPage.clickRegisterUserButton();
    }

    @Then("^I should see the verify user card$")
    public void i_should_see_the_verify_user_card(){
    }

    @And("^the Name should be \"([^\"]*)\"$")
    public void the_Name_should_be(String name) {
        mRegisterUserVerify.checkNameValue(name);

    }
}
