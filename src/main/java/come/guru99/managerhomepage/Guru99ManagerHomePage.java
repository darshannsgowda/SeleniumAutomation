package come.guru99.managerhomepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.base.BaseClass;

public class Guru99ManagerHomePage extends BaseClass
{
	protected WebDriver driver;
	
	@FindBy(tagName = "marquee")
	WebElement WelcomePageMenuopt ;
	
	@FindBy(xpath ="//a[@href=\"addcustomerpage.php\"]")
	WebElement NewCustomerMenuopt;
	
	@FindBy(xpath = "//a[@href=\"EditCustomer.php\"]")
	public
	WebElement EditCustomerMenuopt;
	
	@FindBy(xpath ="//a[@href=\"DeleteCustomerInput.php\"]")
	WebElement DeleteCustomerMenuopt;
	
	@FindBy(xpath ="//a[@href=\"addAccount.php\"]")
	WebElement NewAccountMenuopt;
	
	@FindBy(xpath ="//a[@href=\"editAccount.php\"]")
	WebElement EditAccountMenuopt;
	
	@FindBy(xpath ="//a[@href=\"deleteAccountInput.php\"]")
	WebElement DeleteAccountMenuopt;
	
	@FindBy(xpath="//a[@href=\"DepositInput.php\"]")
	WebElement DepositMenuopt;
	
	@FindBy(xpath = "//a[@href=\"WithdrawalInput.php\"]")
	WebElement WithDrawlMenuopt;
	
	@FindBy(xpath ="//a[@href=\"FundTransInput.php\"]")
	WebElement FundTransferMenuopt;
	
	@FindBy(xpath ="//a[@href=\"PasswordInput.php\"]")
	WebElement ChangePasswordMenuopt;
	
	@FindBy(xpath = "//a[@href=\"BalEnqInput.php\"]")
	WebElement BalEnquiryMenuopt;
	
	@FindBy(xpath ="//a[@href=\"MiniStatementInput.php\"]")
	WebElement MiniStatmntMenuopt;
	
	@FindBy(xpath ="//a[@href=\"CustomisedStatementInput.php\"]")
	WebElement CustomStatmntMenuopt;
	
	@FindBy(xpath ="//a[@href=\"Logout.php\"]")
	WebElement LogOutMenuopt;
	
	public Guru99ManagerHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Guru99_Welcome_Page_Title() {
		WelcomePageMenuopt.isDisplayed();
	}
	
	public void Creation_of_New_Customer() {
		NewCustomerMenuopt.click();
	}
	
	public void Edition_of_Customer_Details() {
		EditCustomerMenuopt.click();
	}
	
	public void Deletion_of_Customer() {
		DeleteCustomerMenuopt.click();
	}
	
	public void Creation_of_NewAccount() {
		NewAccountMenuopt.click();
	}
	
	public void Edition_of_Account() {
		EditAccountMenuopt.click();
	}
	
	public void Deletion_of_Account() {
		DeleteAccountMenuopt.click();
	}
	
	public void Deposit() {
		DepositMenuopt.click();
	}
	
	public void WithDraw() {
		WithDrawlMenuopt.click();
	}
	
	public void Fund_Transfer() {
		FundTransferMenuopt.click();
	}
	
	public void Change_Password() {
		ChangePasswordMenuopt.click();
	}
	
	public void Bal_Enquiry() {
		BalEnquiryMenuopt.click();
	}
	
	public void Mini_StateMent() {
		MiniStatmntMenuopt.click();
	}
	
	public void Custom_Statemnt() {
		CustomStatmntMenuopt.click();
	}
	
	public void Logout_From_HomePage() {
		LogOutMenuopt.click();
	}
}
