package com.codecool.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {

    WebDriver driver;

    @FindBy(name = "uid")

    WebElement user99GuruName;

    @FindBy(name = "password")

    WebElement password99Guru;

    @FindBy(className = "barone")

    WebElement titleText;

    @FindBy(name = "btnLogin")

    WebElement login;

    public Guru99Login(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
