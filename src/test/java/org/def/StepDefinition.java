package org.def;

import org.base.BaseClass;
import org.base.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	@Given("User launch the browser")
	public void userLaunchTheBrowser() {
		browser();
		waits(5);
	}

	@When("User enters vaild Url")
	public void userEntersVaildUrl() {
	   passUrl();
	}
	
    @When("User enter the valid {string} and  {string}")
    public void userEnterTheValidAnd(String string, String string2) {
  
	 PojoClass p=new PojoClass();
	 passUser(p.getUsername(),string);
	 passWord(p.getPassword(),string2);

	  
	}

	@Then("User wish to close the browser")
	public void userWishToCloseTheBrowser()   {
		
   
	}


	
	
}
