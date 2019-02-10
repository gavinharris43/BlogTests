package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/button")
	private WebElement button;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/h1")
	private WebElement Sucess;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/ul/li[9]/a")
	private WebElement navlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/form[2]/button")
	private WebElement delbutton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/form[1]/p")
	private WebElement sucess;
	

	
	public void delUser() throws InterruptedException {
		navlink.click();
		Thread.sleep(2000);
		delbutton.click();
	}
	
	public String delUserCheck() throws InterruptedException {
		Thread.sleep(2000);
		return sucess.getText();
	}
	
	
	
	public void loginUser(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		button.click();
	}
	
	public String loginAttemptText() throws InterruptedException {
		Thread.sleep(2000);
		return Sucess.getText();
	}
	
	
}
