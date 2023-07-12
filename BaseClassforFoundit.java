package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassforFoundit {

	static ChromeDriver driver;
	static PageObject p=new PageObject();
	
	@BeforeMethod
	public void Openbrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		PageFactory.initElements(driver, p);
		
	}
	
	@AfterMethod
	public void Closebrowser() {
		driver.quit();
	}
	
	public String m(String key) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/Inputdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Data");
		DataFormatter d=new DataFormatter();
		Cell res=null;
		switch (key) {
		case "url":res= sheet.getRow(1).getCell(1);
		      break;
		case "IVURL":res= sheet.getRow(2).getCell(1);
		      break;
		case "Alphabet":res= sheet.getRow(7).getCell(1);
		      break;
		case "Special":res= sheet.getRow(8).getCell(1);
		      break;
		case "Number":res=sheet.getRow(9).getCell(1);
		      break;
		case "Password":res=sheet.getRow(5).getCell(1);
		      break;
		case "MobileNo":res=sheet.getRow(6).getCell(1);
		      break;
		case "IVMobileno":res=sheet.getRow(10).getCell(1);
		      break;
		case "FullName":res=sheet.getRow(3).getCell(1);
		      break;
		case "EmailId":res=sheet.getRow(4).getCell(1);
		      break;
		
		
		
		default:
			break;
		}
		String value = d.formatCellValue(res);
		return value;
		
	}
}