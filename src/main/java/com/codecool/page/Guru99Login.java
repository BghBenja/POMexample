package com.codecool.page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Guru99Login {

    WebDriver driver;

    By user99GuruName = By.name("uid");

    By password99Guru = By.name("password");

    By titleText = By.className("barone");

    By login = By.name("btnLogin");

    public Guru99Login(WebDriver driver) {

        this.driver = driver;

    }

    public void setUserName(String strUsername) {

        driver.findElement(user99GuruName).sendKeys(strUsername);

    }

    public void setPassword(String strPassword) {

        driver.findElement(password99Guru).sendKeys(strPassword);

    }

    public void clickLogin() {

        driver.findElement(login).click();

    }

    public String getLoginTitle() {

        return driver.findElement(titleText).getText();

    }

    public void loginToGuru99(String strUsername, String strPassword) {

        this.setUserName(strUsername);

        this.setPassword(strPassword);

        this.clickLogin();

    }
}
