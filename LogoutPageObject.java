package com.lmshackathon.pageobject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class LogoutPageObject 
{
	 WebDriver driver;

     public LogoutPageObject(WebDriver driver) 
     {
    	 this.driver = driver;
	 }
     
     By logoutBtn = By.xpath("//button[@id='logout']");
     
     public void clickOnLogout()
     {
    	 driver.findElement(logoutBtn).click(); 
     }
	

}
