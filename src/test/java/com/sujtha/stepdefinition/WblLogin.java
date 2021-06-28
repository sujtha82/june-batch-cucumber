package com.sujtha.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sr_latn.I;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WblLogin {

    private WebDriver driver;

    @Given("given the login url")
    public void givenTheLoginUrl() throws IOException {
        System.setProperty( "webdriver.chrome.driver" ,"C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.get("http://whiteboxqa.com/login.php");

    }

    @When("put login credential")
    public void putLoginCredential() throws IOException {
        WebElement username = driver.findElement ( By.xpath ("//input[@id='username']" ));
        username.sendKeys ( "sujatha.naren9@gmail.com" );
        WebElement password = driver.findElement ( By.xpath ( ("//input[@id='password") ) );
        password.sendKeys ( "pradhyun9" );
        WebElement login = driver.findElement ( By.xpath ( "//button[text()='Login']" ));
        login.click ();
    }

    @Then("verify the porfile titile")
    public void verifyThePorfileTitile() throws IOException {
        String title = driver.getTitle ();
        Assert.assertEquals ( "QA/QE/SDET Training." ,title);
    }
}
