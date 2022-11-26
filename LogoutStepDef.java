package com.lmshackathon.step.definition;

import org.picocontainer.PicoContainer;
import com.lmshackathon.base.ConfigReader;
import com.lmshackathon.base.TestContextManager;
import com.lmshackathon.pageobject.LogoutPageObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDef 
{
	public PicoContainer pico= TestContextManager.newContainer();
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website()
	{
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        
	}

	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() 
	{
		pico.getComponent(LogoutPageObject.class).clickOnLogout();

	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() 
	{
	     String URL = pico.getComponent(WebDriver.class).getCurrentUrl();
		 Assert.assertEquals(URL, "http://lmsportal.com" );
	}


}
