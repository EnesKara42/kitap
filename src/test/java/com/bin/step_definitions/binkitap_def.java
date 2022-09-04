package com.bin.step_definitions;

import com.bin.pages.binKitapPage;
import com.bin.utilities.BrowserUtils;
import com.bin.utilities.ConfigurationReader;
import com.bin.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class binkitap_def {
    binKitapPage binKitapPage = new binKitapPage();
    Robot robot = new Robot();
    JavascriptExecutor j = (JavascriptExecutor) Driver.get();
    Actions actions=new Actions(Driver.get());

    public binkitap_def() throws AWTException {
    }

    @Given("user logged in")
    public void user_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        binKitapPage.login();

    }

    @When("user publish")
    public void user_publish() {
        Driver.get().findElement(By.xpath("//p[.='İzin ver']")).click();
        binKitapPage.paylaş.click();
        binKitapPage.alıntıPaylaş.click();

    }

    @Then("user should login and publish something successfully {string} and {string}")
    public void user_should_login_and_publish_something_successfully_and(String kitap, String alıntı) throws InterruptedException {

        binKitapPage.önceKitapSeçin.sendKeys(kitap);
        Thread.sleep(5000);
      actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(5000);
      actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);


        binKitapPage.alıntınız.sendKeys(alıntı);
        binKitapPage.pAYLAŞenson.click();
        Driver.get().get(ConfigurationReader.get("url1"));
        Thread.sleep(3000);

        BrowserUtils.verifyElementDisplayed(By.xpath("//span[contains(text(),'"+alıntı+"')]"));


    }

}
