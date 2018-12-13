package come.guru99.homepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement UserId;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//marquee[@class=\"heading3\"]")
	WebElement WelcomePage;
	
	@FindBy(xpath ="//a[@href=\"Logout.php\"]")
	WebElement LogoutfromGuru99;
	
	@FindBy(xpath ="//input[@name=\"btnReset\"]")
	WebElement ResetBtn;
	
	@FindBy(xpath ="//a[@href = \"http://demo.guru99.com/\"]")
	WebElement GenerateNwAct;
	
	@FindBy(xpath ="//input[@name=\"emailid\"]")
	WebElement NewEml;
	
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement SubmitBtn;
	
	@FindBy(xpath ="(//tr/td[@class=\"accpage\"])[1]")
	WebElement GetTitle;
	public Guru99LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginToAccount() throws InterruptedException {
		UserId.sendKeys("mngr167859");
		Password.sendKeys("mEdameb");
		LoginBtn.click();
		WelcomePage.isDisplayed();
		Thread.sleep(3000);
//		LogoutfromGuru99.click();
//		Thread.sleep(4000);
//		 Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(4000);
		
	}
	
//	public void CreateNwAcnt() throws InterruptedException {
//		GenerateNwAct.click();
//		NewEml.sendKeys("user@votercircle.in");
//		SubmitBtn.click();
//		GetTitle.isDisplayed();
//		Thread.sleep(3000);
//	}
}


