package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMpageForFacebook {

	//Decliration
	@FindBy(id="email") private WebElement usernameTF;
	@FindBy(id="pass")  private WebElement passwordTF;
	@FindBy(name="login") private WebElement loginButton;
	@FindBy(linkText = "Forgotten passward?") private WebElement forgotPasswordLink;
	@FindBy(linkText = "Create new account") private WebElement createNewAccountLink;
	@FindBy(linkText = "Create a page") private WebElement createAPage;
	
	//Initialization
	public POMpageForFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	public void setPassward(String passward) {
		passwordTF.sendKeys(passward);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void clickForgotPassward() {
		forgotPasswordLink.click();
	}
	public void clickCreateAccount() {
		createNewAccountLink.click();
	}
	public void clickCreateAPage() {
		createAPage.click();
	}
	
}
