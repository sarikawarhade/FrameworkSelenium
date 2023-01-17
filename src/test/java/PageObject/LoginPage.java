package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver; 
  
  public LoginPage(WebDriver rDriver)
  {
	  ldriver = rDriver;
	  PageFactory.initElements( rDriver,this);
  }
  
  @FindBy(id="username")
  WebElement UserName ;
  
  @FindBy( css=".textField.pwdfield")
  WebElement Password;
  
  @FindBy(css="#loginButton>div")
  WebElement LoginBtn;
  
	  public void enterUserName(String UserNameAdd)
	  {
		  UserName.sendKeys(UserNameAdd);
	  }

	  public void enterPassword(String pwd)
	  {
		  Password.sendKeys(pwd);
	  }
	  public void clickOnLogibButton()
	  {
		  LoginBtn.click();
	  }
}

