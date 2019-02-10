package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/ul/li[9]/a")
	private WebElement navlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/button")
	private WebElement button;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/form[1]/p")
	private WebElement sucess;
	

	
	public void delUser() throws InterruptedException {
		navlink.click();
		Thread.sleep(2000);
		button.click();
	}
	
	public String delUserCheck() throws InterruptedException {
		Thread.sleep(2000);
		return sucess.getText();
	}
	
	
}
