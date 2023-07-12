package Framework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends BaseClassforFoundit {
	
     
	@Test
	public void TC_001() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "Registration | foundit India");
		Reporter.log("Create an account page is displayed",true);
	}
	
	@Test
	public void TC_002() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		assertEquals(driver.getCurrentUrl(), "https://www.foundit.in/seeker/registration");
		Reporter.log("Url is same",true);
	}
	
	@Test
	public void TC_003() throws EncryptedDocumentException, IOException {
		driver.get(m("IVURL"));
		assertNotEquals(driver.getCurrentUrl(), "https://www.foundit.in/");
		Reporter.log("Url is not same",true);
	}
	
	@Test
	public void TC_004() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		assertEquals(driver.getTitle(), "Registration | foundit India");
		Reporter.log("Title is same",true);
	}
	
	@Test
	public void TC_005() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		boolean displayed = p.Foundit.isDisplayed();
		assertEquals(displayed, true);
		Reporter.log("Logo is displayed",true);
	}

	@Test
	public void TC_006() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String color = p.Continuebutton.getCssValue("color");
		Reporter.log("Continue button color is--> "+color,true);
		assertEquals(color, "rgba(255, 255, 255, 1)");
	}
	
	@Test
	public void TC_007() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Foundit.click();
		Thread.sleep(1000);
		assertEquals(driver.getCurrentUrl(), "https://www.foundit.in/");
	}
	
	@Test
	public void TC_008() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String text = p.Titletext.getText();
		Reporter.log("Text is present--> "+text,true);
		assertEquals(text, "Create an account");
	}
	
	@Test
	public void TC_009() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Linkedin.click();
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(1));
		String title = driver.getTitle();
		Reporter.log("Linkedin page is displayed--> "+title,true);
		assertEquals(title, "LinkedIn Login, Sign in | LinkedIn");
	}
	
	@Test
	public void TC_010() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Google.click();
		Thread.sleep(1000);
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(1));
		String title = driver.getTitle();
		Reporter.log("Google is displayed--> "+title,true);
		assertEquals(title, "Sign in - Google Accounts");
	}
	
	@Test
	public void TC_011() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Facebook.click();
		Thread.sleep(1000);
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(1));
		String title = driver.getTitle();
		Reporter.log("Facebook page is displayed--> "+title,true);
		assertEquals(title, "Facebook");
	}
	
	@Test
	public void TC_012() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Loginlink.click();
		Thread.sleep(1000);
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(0));
		String title = driver.getTitle();
		Reporter.log("Login page is displayed--> "+title,true);
		assertEquals(title, "Jobseeker's Sign in - Search & Apply to Latest Jobs Online | foundit India");
	}
	
	@Test
	public void TC_013() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String text = p.FullNamePlaceholder.getText();
		Reporter.log("Placeholder is present--> "+text,true);
		assertEquals(text, "Full Name *");
	}
	
	@Test
	public void TC_014() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.FullName.sendKeys(m("Alphabet"),Keys.TAB);
		Thread.sleep(2000);
	}
	
	@Test
	public void TC_015() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.FullName.sendKeys(m("Special"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-15",true);
	}
	
	@Test
	public void TC_016() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.FullName.sendKeys(m("Number"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-16",true);
	}
	
	@Test
	public void TC_017() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String text = p.EmailIdPlaceholder.getText();
		Reporter.log("Placeholder is present--> "+text,true);
		assertEquals(text,"Email ID *");
	}
	
	@Test
	public void TC_018() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Emailid.sendKeys(m("Alphabet"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-18",true);
	}
	
	@Test
	public void TC_019() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Emailid.sendKeys(m("Number"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-19",true);
	}
	
	@Test
	public void TC_020() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Emailid.sendKeys(m("Special"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-20",true);
	}
	
	@Test
	public void TC_021() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String text = p.PasswordPlaceholder.getText();
		Reporter.log("Placeholder is present--> "+text,true);
		assertEquals(text, "Password *");
	}
	
	@Test
	public void TC_022() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Password.sendKeys(m("Password"));
		p.Passwordeye.click();
		Thread.sleep(2000);
		Reporter.log("Test case is pass-22",true);
	}
	
	@Test
	public void TC_023() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Password.sendKeys(m("Number"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-23",true);
	}
	
	@Test
	public void TC_024() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.Password.sendKeys(m("Special"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-24",true);
	}
	
	@Test
	public void TC_025() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		driver.get(m("url"));
		p.Register.click();
		p.Dropdown.click();
		p.DropdownOption.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
    
	@Test 
	public void TC_026() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		String text = p.MobileNoPlaceholder.getText();
		Reporter.log("Placeholder is present--> "+text,true);
		assertEquals(text, "Mobile Number *");
	}
	
	@Test
	public void TC_027() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.MobileNum.sendKeys(m("MobileNo"));
		Thread.sleep(2000);
		Reporter.log("Test case is pass-27",true);
	}
	
	@Test
	public void TC_028() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.MobileNum.sendKeys(m("Number"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
	}
	
	@Test
	public void TC_029() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.MobileNum.sendKeys(m("IVMobileno"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
	}
	
	@Test
	public void TC_030() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.MaleRadio.click();
		Thread.sleep(2000);
		Reporter.log("Male radio button is working",true);
	}
	
	@Test
	public void TC_031() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.FemaleRadio.click();
		Thread.sleep(2000);
		Reporter.log("Female radio button is working",true);
	}
	
	@Test
	public void TC_032() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.PreferRadio.click();
		Thread.sleep(2000);
		Reporter.log("Prefer radio button is working",true);
	}
	
	@Test
	public void TC_033() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		p.ReceiveCheckbox.click();
		Thread.sleep(2000);
		Reporter.log("Receive Check Box is working",true);
	}
	
	@Test
	public void TC_034() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		p.TermsConditions_Link.click();
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(0));
		assertEquals(driver.getTitle(), "Terms of Use for Job Seekers and Recruiters | founditIndia");
	}
	
	@Test
	public void TC_035() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		p.PrivacyPolicy_Link.click();
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(allwin);
		driver.switchTo().window(a.get(0));
		assertEquals(driver.getCurrentUrl(), "https://www.foundit.in/info/privacy");
	}
	
	@Test
	public void TC_036() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		Thread.sleep(2000);
		File f = new File("./Data/Surendren_Resume.docx");
		String absolutePath = f.getAbsolutePath();
		p.UploadResume.sendKeys(absolutePath);
		Thread.sleep(3000);
		p.Okaybutton.click();
	}
	
	@Test
	public void TC_037() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		List<WebElement> Text = p.LogoBelowmText;
		int count = Text.size();
		for (int i = 0; i < count; i++) {
			String text2 = Text.get(i).getText();
			System.out.println(text2);
		}
	}

	@Test
	public void TC_038() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		int name = p.FullName.getLocation().getX();
		int email = p.Emailid.getLocation().getX();
		int pass = p.Password.getLocation().getX();
		assertEquals(name, email);
	    Reporter.log("Both are aligned properly "+name+"="+email,true);
	    assertEquals(name, pass);
		Reporter.log("Both are aligned properly "+name+"="+pass,true);
	}
	
	@Test
	public void TC_039() throws EncryptedDocumentException, IOException {
		driver.get(m("url"));
		p.Register.click();
		p.Continuebutton.click();
		assertEquals(p.Errormessage.getText(), "This field is required.");
	}
	
	@Test
	public void TC_040() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.get(m("url"));
		p.Register.click();
		File f = new File("./Data/Surendren_Resume.docx");
		String absolutePath = f.getAbsolutePath();
		p.UploadResume.sendKeys(absolutePath);
		Thread.sleep(3000);
		p.Okaybutton.click();
		p.FullName.sendKeys(m("FullName"));
		p.Emailid.sendKeys(m("EmailId"));
		p.Password.sendKeys(m("Password"));
		p.MobileNum.sendKeys(m("MobileNo"));
		p.MaleRadio.click();
		p.Continuebutton.click();
	}
}