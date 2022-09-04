package com.bin.pages;

import com.bin.step_definitions.binkitap_def;
import com.bin.utilities.ConfigurationReader;
import com.bin.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class binKitapPage {


    public binKitapPage() {
        PageFactory.initElements(Driver.get(), this);


    }

    public void login() {
        this.inputUsername.sendKeys(ConfigurationReader.get("username"));
        this.inputPassword.sendKeys(ConfigurationReader.get("password"));
        this.loginButton.click();

    }


    @FindBy(xpath = "//input[@placeholder='1000Kitap şifreniz']")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@placeholder='E-posta veya kullanıcı adı']")
    public WebElement inputUsername;
    @FindBy(xpath = "//span[@class='text user-select-none letter-wider text-center text-beyaz-gunduz font-medium text-13']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[@class='svg svg-23']//*[name()='svg']")
    public WebElement paylaş;
    @FindBy(xpath = "//span[contains(text(),'Alıntı Paylaş')]")
    public WebElement alıntıPaylaş;
    @FindBy(xpath = "//input[contains(@placeholder,'Önce kitap seçin')]")
    public WebElement önceKitapSeçin;




    @FindBy(xpath = "//textarea[@placeholder='Alıntınız...']")
    public WebElement alıntınız;
    @FindBy(xpath = "//span[contains(text(),'PAYLAŞ')]")
    public WebElement pAYLAŞenson;




}




