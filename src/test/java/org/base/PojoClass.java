package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{

    public PojoClass() {
		PageFactory.initElements(driver, this);
	}
    
    @FindBy(id="email")
    private WebElement username;

	public WebElement getUsername() {
		return username;
	}
    
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name="login")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}
	
	
	
	
	
	
	
}
