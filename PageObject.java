package Framework;


import java.util.List;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class PageObject {

//	public PageObject(ChromeDriver driver) {
//		PageFactory.initElements(driver,this);
//	}	
	@FindBy(xpath = "//a[.='Register']")
	WebElement Register;
	
	@FindBy(xpath = "//img[@alt='foundit logo']")
	WebElement Foundit;
	
	@FindBy(xpath = "//span[.='Continue']")
	WebElement Continuebutton;
	
	@FindBy(xpath = "//h1[contains(.,'Create an account')]")
	WebElement Titletext;
	
	@FindBy(xpath =  "//div[@class='linkedinTab socialLoginTab']")
	WebElement Linkedin;
	//
	@FindBy(id = "googleSignIn")
	WebElement Google;
	
	@FindBy(xpath = "//div[@class='facebookTab socialLoginTab']")
	WebElement Facebook;
	
	@FindBy(xpath = "//span[.='Login']")
	WebElement Loginlink;
	
	@FindBy(xpath = "//label[contains(.,'Full Name')]")
	WebElement FullNamePlaceholder;
	
	@FindBy(xpath = "//input[@id='fullName']")
	WebElement FullName;
	
	@FindBy(xpath = "//label[contains(.,'Email ID')]")
	WebElement EmailIdPlaceholder;
	
	@FindBy(xpath = "//input[@id='emailId']")
	WebElement Emailid;
	
	@FindBy(xpath = "//label[contains(.,'Password')]")
	WebElement PasswordPlaceholder;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath = "//i[@class='passwordEye mqfisrp-eye-close']")
	WebElement Passwordeye;
	
	@FindBy(xpath = "//select[@class=\"formField mobileNumberISDSelect\"]")
	WebElement Dropdown;
	
	@FindBy(xpath = "//option[contains(.,'India ')]")
	WebElement DropdownOption;
	
	@FindBy(xpath = "//label[contains(.,'Mobile Number')]")
	WebElement MobileNoPlaceholder;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	WebElement MobileNum;
	
	@FindBy(id = "option-0")
	WebElement MaleRadio;
	
	@FindBy(id = "option-1")
	WebElement FemaleRadio;
	
	@FindBy(id = "option-2")
	WebElement PreferRadio;
	
	@FindBy(xpath = "//div[@class='toggleFill']")
	WebElement ReceiveCheckbox;
	
	@FindBy(xpath = "//a[.='Terms and Conditions']")
	WebElement TermsConditions_Link;
	
	@FindBy(xpath = "(//a[.='Privacy Policy'])[1]")
	WebElement PrivacyPolicy_Link;
	
	@FindBy(xpath = "//input[@type='file']")
	WebElement UploadResume;
	
	@FindBy(xpath = "(//div[contains(.,'Okay')])[6]")
	WebElement Okaybutton;
	
	@FindBy(className = "listItem")
	List<WebElement> LogoBelowmText;
	
	@FindBy(xpath = "(//p[@class='errorMessage'])[1]")
	WebElement Errormessage;
	
//	
//	public void Register() {
//		Register.click();
//	}
//	
	
}
