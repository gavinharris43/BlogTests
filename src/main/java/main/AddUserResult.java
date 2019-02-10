package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserResult {

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/form/p" )
	private WebElement sucessful;


	public String acountCreated() {
		return sucessful.getText();
		
	}

}
