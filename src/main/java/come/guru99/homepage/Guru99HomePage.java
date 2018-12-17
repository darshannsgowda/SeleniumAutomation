package come.guru99.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage 
{
	WebDriver driver;
	
	@FindBy(tagName = "marquee")
	WebElement WelcomePage ;
	
	@FindBy(xpath ="//a[@href=\"addcustomerpage.php\"]")
	WebElement NewCustomer;
	
	@FindBy(xpath = "//a[@href=\"EditCustomer.php\"]")
	WebElement EditCustomer;
	
	@FindBy(xpath ="//a[@href=\"DeleteCustomerInput.php\"]")
	WebElement DeleteCustomer;
	
	@FindBy(xpath ="//a[@href=\"addAccount.php\"]")
	WebElement NewAccount;
	
	@FindBy(xpath ="//a[@href=\"editAccount.php\"]")
	WebElement EditAccount;
	
	@FindBy(xpath ="//a[@href=\"deleteAccountInput.php\"]")
	WebElement DeleteAccount;
	
	@FindBy(xpath="//a[@href=\"DepositInput.php\"]")
	WebElement Deposit;
	
	@FindBy(xpath = "//a[@href=\"WithdrawalInput.php\"]")
	WebElement WithDrawl;
	
	@FindBy(xpath ="//a[@href=\"FundTransInput.php\"]")
	WebElement FundTransfer;
	
	@FindBy(xpath ="//a[@href=\"PasswordInput.php\"]")
	WebElement ChangePassword;
	
	@FindBy(xpath = "//a[@href=\"BalEnqInput.php\"]")
	WebElement BalEnquiry;
	
	@FindBy(xpath ="//a[@href=\"MiniStatementInput.php\"]")
	WebElement MiniStatmnt;
	
	@FindBy(xpath ="//a[@href=\"CustomisedStatementInput.php\"]")
	WebElement CustomStatmnt;
	
	@FindBy(xpath ="//a[@href=\"Logout.php\"]")
	WebElement LogOut;
	
	public Guru99HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Guru99_Welcome_Page_Title() {
		WelcomePage.isDisplayed();
	}
	
	public void Creation_of_New_Customer() {
		NewCustomer.click();
	}
	
	public void Edition_of_Customer_Details() {
		EditCustomer.click();
	}
	
	public void Deletion_of_Customer() {
		DeleteCustomer.click();
	}
	
	public void Creation_of_NewAccount() {
		NewAccount.click();
	}
	
	public void Edition_of_Account() {
		EditAccount.click();
	}
	
	public void Deletion_of_Account() {
		DeleteAccount.click();
	}
	
	public void Deposit() {
		Deposit.click();
	}
	
	public void WithDraw() {
		WithDrawl.click();
	}
	
	public void Fund_Transfer() {
		FundTransfer.click();
	}
	
	public void Change_Password() {
		ChangePassword.click();
	}
	
	public void Bal_Enquiry() {
		BalEnquiry.click();
	}
	
	public void Mini_StateMent() {
		MiniStatmnt.click();
	}
	
	public void Custom_Statemnt() {
		CustomStatmnt.click();
	}
	
	public void Logout_From_HomePage() {
		LogOut.click();
	}
}
