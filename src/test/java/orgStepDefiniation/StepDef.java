package orgStepDefiniation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basic.Program.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginPg;
	@Given("User Launch chrome brower")
	public void user_launch_chrome_brower() {
	//WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 loginPg =new LoginPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User enter UserName as \"admin\"and Password as {string}")
	public void user_enter_user_name_as_admin_and_password_as(String UserName,String Password) {
		 loginPg.enterUserName(UserName);
		 loginPg.enterPassword(Password);
	}

	@When("Click on Login")
	public void click_on_login() {
  loginPg.loginButton>div
	}

	@Then("page Tital should be\"http:\\/\\/localhost:{int}\\/user\\/submit_tt.do\"")
	public void page_tital_should_be_http_localhost_user_submit_tt_do(Integer int1){
		String actualTital=driver.getTital
	}
	  

	@When("User click on log out link")
	public void user_click_on_log_out_link() {
	//	String actualTital=driver.getTital
	
	}

	@Then("Page Tital should be {string}")
	public void page_tital_should_be(String string) {
	//	String actualTital=driver.getTital
	}

	@Then("close browser")
	public void close_browser() {
	
	}


}
