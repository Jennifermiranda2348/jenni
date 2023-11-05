package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	@FindBy(xpath="usernmae")
	private WebElement UserName;
	
	@FindBy(id="inputPassword")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement LoginBtn;

	public WebElement getUserName() {
		return UserName;
	}

	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setUserName(WebElement userName) {
		UserName = userName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		LoginBtn = loginBtn;
	}
	
	

}
