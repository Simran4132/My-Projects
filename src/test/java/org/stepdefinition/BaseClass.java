package org.stepdefinition;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void lanchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void WindoMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Title=" + title);
	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void clickbtn(WebElement ele) {
		ele.click();
	}

	public static void closeEntireBrowser() {
		driver.quit();

	}


	public static void screenShot (String imgname) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File image=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("Location+imgname.png");
		FileUtils.copyFile(image, f);
	}
	public static Actions a;
	public static void moveTheCursor(WebElement  targetWebElement) {
		a=new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	public static void dragDrop(WebElement dragWebElement,WebElement dropElement) {
		a=new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();	
	}
	
	public static JavascriptExecutor Js;
	 public static void scrolThePage(WebElement tarWebEle) {
		 Js=(JavascriptExecutor)driver;
		 Js.executeScript("arguments[0].scrollIntoView(true)",tarWebEle);
		
	 }
	 public static void ExcelRead(String sheetName,int rowName,int cellName) throws IOException {
		 File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\maveninstall\\Excel\\newxl.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet excelsheet = wb.getSheet("sheet1");
		 XSSFRow r = excelsheet.getRow(0);
		 XSSFCell c = r.getCell(cellName);
		 int cellType = c.getCellType();
		 
		 String value=" "; 
		 if (cellType==1) {
			 String value2 = c.getStringCellValue();
			
		}
		 else if (DateUtil.isCellDateFormatted(c)) {
			 Date dd=c.getDateCellValue();
			 SimpleDateFormat s=new SimpleDateFormat(value);
			 String formatvalue = s.format(dd);
		}
		 else {
			 double d = c.getNumericCellValue();
			 long l=(long)d;
			 String ValueOf=String.valueOf(1);
		 }
	 }
	 public static void createNewExcelFile(int rowNum,int cellNum,String writedata)throws IOException {
		 File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\maveninstall\\Excel\\newxl.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("sheet1");
		Row r = s.createRow(rowNum);
		org.apache.poi.ss.usermodel.Cell c = r.createCell(cellNum);
		c.setCellValue(writedata);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
	 }
	 public static void createCell(int getRow,int creCell,String newDta)throws IOException{
		 File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\maveninstall\\Excel\\newxl.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fis);
		 Sheet s = wb.getSheet("sheet1");
		 Row r = s.getRow(getRow);
		 org.apache.poi.ss.usermodel.Cell c = r.createCell(creCell);
		 c.setCellValue(newDta);
		 FileOutputStream fos=new FileOutputStream(f);
		 wb.write(fos);
	 }
	 public static void createRow(int creRow,int creCell,String newData)throws IOException{
		 File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\maveninstall\\Excel\\newxl.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fis);
		 Sheet s = wb.getSheet("sheet1");
		Row r= s.createRow(creRow);
		 Cell c = r.createCell(creCell);
		 c.setCellValue(newData);
		 FileOutputStream fos=new FileOutputStream(f);
		 wb.write(fos);
		 }
	 public static void updateDataToParticularCell(int gettheRow,int getTheCell,String existingData,String writeNewData)throws IOException{
		 File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\maveninstall\\Excel\\newxl.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fis);
		 Sheet s = wb.getSheet("sheet1");
		 Row r = s.getRow(gettheRow);
		 Cell c = r.getCell(getTheCell);
		 String Str = c.getStringCellValue();
		 if (Str.equals(existingData)) {
			 c.setCellValue(writeNewData);
		}
		 FileOutputStream fos=new FileOutputStream(f);
		 wb.write(fos);
	 }
}
	 
