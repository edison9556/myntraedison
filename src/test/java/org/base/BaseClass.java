package org.base;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	
	
	public static void browser() {
		driver=new ChromeDriver();
		
		
		System.out.println("Vijay");
		
	}
	
	public static void waits(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));

	}
	
	public static void passUrl() {
		driver.get("https://www.facebook.com/");
	}
	public static void passUser(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void passWord(WebElement element,String passText) {
	element.sendKeys(passText);
}
public static void loginBtn(WebElement element) {
		element.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
