package org.dsbabaseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DSBABaseClass {
	public static WebDriver driver;
	public static Select s;
	public static TakesScreenshot ts;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert al;
	public static WebDriverWait w;
	public static FluentWait<WebDriver> f;
	public static WebElement dsbaDOBAdmitDateYearr;
	public static WebElement dsbaDobAdmitDateDate;
	//WebDriver Methods
	
	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
	}
	
	public static void launchFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
}
	
	public static void launchMicrosoftEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	public static void launchUrl(String url) {
		driver.get(url);
}
	public static void pageTitle() {
		String titleName = driver.getTitle();
        System.out.println(titleName);
	}
	public static void pageUrl() {
	String currentUrl = driver.getCurrentUrl();
     System.out.println(currentUrl);
	}
	public static void closeBrowser() {
	driver.quit();
}
	public static void pageMaximize() {
		driver.manage().window().maximize();
		}
	public static void closeCurrentPage() {
		driver.close();

	}
	public static void dsbaDOBYear(String dsbaDOBAdmitDateYear) {
		 dsbaDOBAdmitDateYearr = driver.findElement(By.xpath("//button[text()='"+dsbaDOBAdmitDateYear+"']"));
		 clickUsingJavaScript(dsbaDOBAdmitDateYearr);
}
	
	public static void dsbaDOBDate(String dobDate) {
		dsbaDobAdmitDateDate = driver.findElement(By.xpath("//button[text()='"+dobDate+"']"));
		clickUsingJavaScript(dsbaDobAdmitDateDate);

	}
	
	public static String generateRandomName(int m) {
		  String randomName = RandomStringUtils.randomAlphabetic(m);
		 return randomName;
		}
	
	public static String generateRandomNumber(int n) {
		String randomPhoneNumber = RandomStringUtils.randomNumeric(n);
		return randomPhoneNumber;

	}
	
	public static String generateRandomDOB(int m ,int n) {
		String dob = RandomStringUtils.randomNumeric(m,n);
		return dob;
}
	
//	private void selectRandomCheckBox() {
//		 if (checkboxes.size() > 0) {
//	            // Generate a random index
//	            Random random = new Random();
//	            int randomIndex = random.nextInt(checkboxes.size());
//
//	            // Select the checkbox at the random index
//	            WebElement randomCheckbox = checkboxes.get(randomIndex);
//	            randomCheckbox.click();
//
//	            // Wait for a moment to see the selected checkbox (you might want to handle this more robustly)
//	            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	        } else {
//	            System.out.println("No checkboxes found on the page.");
//	        }
//	}
	
	public static void selectRandomValuesFromDropdown(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		 if (options.size() > 1) {
	            // Remove the first option from the list
	            List<WebElement> optionsToSelect = new ArrayList(options.subList(1, options.size()));

	            // Randomly select an option from the remaining options
	            Random random = new Random();
	            WebElement randomOption = optionsToSelect.get(random.nextInt(optionsToSelect.size()));

	            // Perform the selection
	            randomOption.click();

	            // Wait for a moment to see the selected option (you might want to handle this more robustly)
	           // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        } else {
	            System.out.println("Not enough options in the dropdown to exclude the first one.");
	        }
		
		
		
		
		
		
		
		
		
		
//		int a = options.size();
//		Random rand = new Random();
//		int b = rand.nextInt(a);
//		s.selectByIndex(b);
		}
	
	
	
	
	
	
	
	//WebElement methods
	
  public static void fillTextBox(WebElement ele,String name) {
	ele.sendKeys(name);
}
  public static void clickButton(WebElement ele1) {
	ele1.click();
}
  //Selenium Text methods
  public static String getTheAttributeValue(WebElement ele3,String name) {
	String att = ele3.getAttribute(name);
System.out.println(att);
return att;

}
  public static void printText(WebElement ele4) {
	String texts = ele4.getText();
System.out.println(texts);
}
 
  //Take Screenshot methods
  public static void takeSnap(String name) throws IOException {
	ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\ScreenShots\\"+name+".png");
FileUtils.copyFile(src, des);
}
  public static void deleteField() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	r.keyRelease(KeyEvent.VK_BACK_SPACE);
	
}
  
  public static void tabButton() throws AWTException {
	  r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

}
 
  
  
  
  
   //Actions Methods
  public static void moveTheCursorToTheElement(WebElement element) {
	a=new Actions(driver);
	a.moveToElement(element).perform();
}
  public static void dragDrop(WebElement src,WebElement des) {
	  a=new Actions(driver);
	a.dragAndDrop(src,des).perform();
  }
  public static void clickTwoTimes(WebElement ele5) {
	  a=new Actions(driver);
	a.doubleClick(ele5).perform();
}
  
 public static void rightClick(WebElement ele6) {
	 a=new Actions(driver);
	a.contextClick(ele6).perform();
}
 
 public static void smallToCaps(WebElement ele7,String name) { //doubt
	a.keyDown(Keys.SHIFT).sendKeys(ele7,name).keyUp(Keys.SHIFT).perform();
}
 //Robot Methods
 public static void copyText() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
}
 //JavaScript executor Methods
public static void scrollPageUpOrDown(boolean b,WebElement ele8) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView("+b+")",ele8);
	}
public static void fillTextBox(String name,WebElement ele9) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+name+"')",ele9);
	}
public static void printTheAttributeValue(String name, WebElement ele10) {
	js=(JavascriptExecutor)driver;
	Object output = js.executeScript("return arguments[0].getAttribute('"+name+"')",ele10);
	System.out.println(output);
}
public static void clickUsingJavaScript(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);

}
//Alert Method
public static void acceptTheAlert() {
	al=driver.switchTo().alert();
	al.accept();
}
public static void dismissTheAlert() {
	al=driver.switchTo().alert();
	al.dismiss();
}
public static void printTheAlertText() {
	al=driver.switchTo().alert();
	System.out.println(al.getText());
}

public static void alertFillTextField(String name) {
	al=driver.switchTo().alert();
	al.sendKeys(name);
}
//Frame method
public static void moveToFrame(String name) {
	driver.switchTo().frame(name);
}
public static void moveToFrame(WebElement elem) {
	driver.switchTo().frame(elem);
}
public static void moveToFrame(int index) {
	driver.switchTo().frame(index);
}
public static void moveToParentFrame() {
	driver.switchTo().parentFrame();
}
public static void moveToDefault() {
	driver.switchTo().defaultContent();
}
//Select method
public static void selectBySeeingText(WebElement ele2,String option) {
	  s = new Select(ele2);
	  s.selectByVisibleText(option);
}
public static void selectBySeeingIndex(WebElement element,int index) {
	s=new Select(element);
	s.selectByIndex(index);
}
public static void selectBySeeingValue(WebElement element,String name) {
	s=new Select(element);
	s.selectByValue(name);
}
public static void checkWhetherIsMultiple(WebElement element) {
	s=new Select(element);
	boolean multi = s.isMultiple();
	System.out.println(multi);
	}
public static void fetchFirstSelectedOptionFromDropdownText(WebElement element) {
	s=new Select(element);
	WebElement output = s.getFirstSelectedOption();
	String text = output.getText();
	System.out.println(text);
}
public static void fetchFirstSelectedOptionFromDropdownAttribute(WebElement element,String name) {
	s=new Select(element);
	WebElement getAttri = s.getFirstSelectedOption();
	String out = getAttri.getAttribute(name);
	System.out.println(out);
}
public static void fetchAllOptionsText(WebElement elemen) {
	s=new Select(elemen);
	List<WebElement> option = s.getOptions();
	for (WebElement eachOption : option) {
		String each = eachOption.getText();
		System.out.println(each);
	}
}
public static void fetchAllOptionsAttribute(WebElement element,String name) {
	s = new Select(element);
	List<WebElement> options = s.getOptions();
	for (WebElement web : options) {
		String out = web.getAttribute(name);
		System.out.println(out);
	}
}
public static void fetchAllOptionsTextNormalFor(WebElement element) {
	s=new Select(element);
	List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement web = options.get(i);
		String text = web.getText();
		System.out.println(text);
	}
}
public static void fetchAllOptionsValueNormalfor(WebElement element,String name) {
	s=new Select(element);
	List<WebElement> opt = s.getOptions();
	for (int i = 0; i < opt.size(); i++) {
		WebElement webel = opt.get(i);
		String outt = webel.getAttribute(name);
		System.out.println(outt);
		}
}
public static void fetchAllSelectedOptionsTextNormalForLoop(WebElement element) {
	s=new Select(element);
	List<WebElement> allselected = s.getAllSelectedOptions();
	for (int i = 0; i < allselected.size(); i++) {
		WebElement webb = allselected.get(i);
		String texts = webb.getText();
		System.out.println(texts);
		}
}
public static void fetchAllSelectedOptionsTextEnhancedForLoop(WebElement element) {
	s=new Select(element);
	List<WebElement> allselected = s.getAllSelectedOptions();
	for (WebElement all : allselected) {
		String texxt = all.getText();
		System.out.println(texxt);
	}

}
public static void fetchAllSelectedOptionValueNormalForLoop(WebElement element,String name) {
	s=new Select(element);
	List<WebElement> allOptions = s.getAllSelectedOptions();
	for (int i = 0; i < allOptions.size(); i++) {
		WebElement elem = allOptions.get(i);
		String val = elem.getAttribute(name);
		System.out.println(val);
	}
}
public static void fetchEvenRowText(WebElement element) {
	s=new Select(element);
	List<WebElement> opt = s.getOptions();
	for (int i = 0; i < opt.size(); i=i+2) {
		WebElement webele = opt.get(i);
		String texts = webele.getText();
		System.out.println(texts);
	}
}
public static void fetchOddRowText(WebElement element) {
	s=new Select(element);
	List<WebElement> option = s.getOptions();
	for (int i = 0; i < option.size(); i++) {
		if (i%2==1) {
			WebElement webb = option.get(i);
			String textts = webb.getText();
			System.out.println(textts);
			}
	}
	}
public static void removeCommonValues(WebElement element) {
	s=new Select(element);
	List<WebElement> allOption = s.getOptions();
List<WebElement> allSelected = s.getAllSelectedOptions();
allOption.removeAll(allSelected);
for (int i = 0; i < allOption.size(); i++) {
	WebElement allopt = allOption.get(i);
	String out = allopt.getText();
	System.out.println(out);
}
}



//Windows handling
public static void windowSwitchUsingEnhancedForLoop() {
	String parentID = driver.getWindowHandle();
	Set<String> parentChildID = driver.getWindowHandles();
	for (String childID : parentChildID) {
		if (!parentID.equals(childID)) {
			driver.switchTo().window(childID);
		}
	}
}
//move to child window with loop
public static void moveToChildWindowUsingLoop(int n) { //try
	String parentID = driver.getWindowHandle();
Set<String> parentChildID = driver.getWindowHandles();
int count = 0;
for (String childID : parentChildID) {
	if (count == n) {
		driver.switchTo().window(childID);
		}
	count++;
}
}
// move to child window without loop
public static void moveToChildWindowWithoutLoop(int i) { //try
	String parentID = driver.getWindowHandle();
	Set<String> parentChildID = driver.getWindowHandles();
	List<String>li = new ArrayList<String>();
	li.addAll(parentChildID);
	String windows = li.get(i);
	driver.switchTo().window(windows);
}
//date
public static void getDate() {
	Date d = new Date();
	System.out.println(d);
}










//Webtable 
//fetch a single value from table
public static void fetchSingleValueFromTable(WebElement elem,int i,int j) {
	List<WebElement> rows = elem.findElements(By.tagName("tr"));
	WebElement eachRow = rows.get(i);
	List<WebElement> cell = eachRow.findElements(By.tagName("td"));
	WebElement data = cell.get(j);
	System.out.println(data.getText());
	}

//iterate all datas using for loop
public static void iterateAllDatasUsingNormalLoop(WebElement element) {
	List<WebElement> rows = element.findElements(By.tagName("tr"));
	for (int i = 0; i < rows.size(); i++) {
		WebElement eachRow = rows.get(i);
		List<WebElement> data = eachRow.findElements(By.tagName("td"));
		for (int j = 0; j < data.size(); j++) {
			WebElement eachdata = data.get(j);
			System.out.println(eachdata.getText());
		}
	}

}

//iterate using enhanced for loop
public static void iterateAllDatasUsingEnhancedForLoop(WebElement eleme) {
	List<WebElement> rows = eleme.findElements(By.tagName("tr"));
	for (WebElement eachrow : rows) {
		List<WebElement> cell = eachrow.findElements(By.tagName("td"));
		for (WebElement eachCell : cell) {
			String text = eachCell.getText();
			System.out.println(text);
		}
	}
}
//to iterate along with headings
public static void iterateAllDatasWithHeadings(WebElement element) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
WebElement row = allRows.get(0);
List<WebElement> headings = row.findElements(By.tagName("th"));
for (int i = 0; i < headings.size(); i++) {
	WebElement eachCell = headings.get(i);
	String text = eachCell.getText();
	System.out.println(text);
}
for (int i = 0; i < allRows.size(); i++) {
	WebElement eachRow = allRows.get(i);
	List<WebElement> allData = eachRow.findElements(By.tagName("td"));
	for (int j = 0; j < allData.size(); j++) {
		WebElement datas = allData.get(j);
		System.out.println(datas.getText());
	}
}
}
//to print only even rows
public static void printEvenRows(WebElement element) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
	for (int i = 0; i < allRows.size(); i++) {
		if (i%2==0) {
			WebElement eachRow = allRows.get(i);
			List<WebElement> allDatas = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < allDatas.size(); j++) {
				WebElement eachData = allDatas.get(j);
				String text = eachData.getText();
				System.out.println(text);
			}
			}
	}
}
//to print particular rows
public static void printParticularRows(WebElement element,int m,int n) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
	for (int i = 0; i < allRows.size(); i++) {
		if (i==m || i==n) {
			WebElement eachRow = allRows.get(i);
			List<WebElement> allDatas = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < allDatas.size(); j++) {
				WebElement eachData = allDatas.get(j);
				String text = eachData.getText();
				System.out.println(text);
			}
		}
	}
	}
//to print particular rows and particular cells
public static void printParticularRowsAndCells(WebElement element,int m,int n,int c,int d) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
	for (int i = 0; i < allRows.size(); i++) {
		if (i==m || i==n) {
			WebElement eachRow = allRows.get(i);
			List<WebElement> allDatas = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < allDatas.size(); j++) {
				if (j==c || j==d) {
					WebElement eachData = allDatas.get(j);
				String text = eachData.getText();
				System.out.println(text);
			}
			}
		}
		}
}
//get row number and cell number of particular data
public static void getRowNumberCellNumberOfParticularData(WebElement element,String text) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
	for (int i = 0; i < allRows.size(); i++) {
		WebElement eachRow = allRows.get(i);
		List<WebElement> allDatas = eachRow.findElements(By.tagName("td"));
		for (int j = 0; j < allDatas.size(); j++) {
			WebElement eachData = allDatas.get(j);
			String name = eachData.getText();
			if (name.equals(text) ) {
				System.out.println("Data:" +name);
				System.out.println("Row number:" +i);
				System.out.println("cell number:" +j);
			}
			}
		}
}
//print particular row without loop
public static void printParticularRowWithoutLoop(WebElement element,int m) {
	List<WebElement> allRows = element.findElements(By.tagName("tr"));
	WebElement eachRow = allRows.get(m);
	String text = eachRow.getText();
	System.out.println(text);
}


//UnconditionalWait methods
public static void unconditionalWait(int millisecond) throws InterruptedException {
Thread.sleep(millisecond);
}
// Implicit wait or dynamic wait
public static void waitForAllLocators(int m) {
	driver.manage().timeouts().implicitlyWait(m, TimeUnit.SECONDS);
}
//WebDriver wait
public static void waitOfWebDrivers(int n) {
	w= new WebDriverWait(driver,n);
}
//fluent wait

public static void waitOfFluent(int m,int n) {
	f=new FluentWait<WebDriver>(driver).withTimeout(m,TimeUnit.SECONDS).pollingEvery(n, TimeUnit.SECONDS)
			.ignoring(Exception.class);
}
//to read all datas from excel
public static String readAllDatasFromExcel(int row,int cell) throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row rows = sh.getRow(row);
	Cell cells = rows.getCell(cell);
	int type = cells.getCellType();
	String data=""; // string data is taken out commonly from below and it is a local variable so it has to be initialized
	if (type==1) {
		 data = cells.getStringCellValue();
	}
	else if (DateUtil.isCellDateFormatted(cells)) {
		Date date = cells.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		 data = sim.format(date);
	}
	else {
		double d = cells.getNumericCellValue();
		long lo = (long)d;
		data = String.valueOf(lo);
	}
	return data;
	
	}
//enterValuesInExistingExcel
public static void enterValuesInExistingExcel(int m,int n,String name) throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book4.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sh = book.getSheet("Sheet4");
	Row r = sh.createRow(m);
	Cell c = r.createCell(n);
	c.setCellValue(name);
	FileOutputStream fos = new FileOutputStream(f);
	book.write(fos);
	}
//createNewSheetNewCellNewRoll
public static void createNewSheetNewCellNewRow(int m,int n,String name) throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book4.xlsx");
	FileInputStream fin= new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.createSheet("Sheet4");
	Row r = sh.createRow(m);
	Cell cl = r.createCell(n);
	cl.setCellValue(name);
	FileOutputStream fos = new FileOutputStream(f);
	book.write(fos);
}
//updateValueInExcel
public static void updateValueInExcel(int m,int n,String name,String name1,String name2) throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row r = sh.getRow(m);
	Cell cl = r.getCell(n);
	String values = cl.getStringCellValue();
	if (values.equals(name)) {
		cl.setCellValue(name1);
		}
	else {
		cl.setCellValue(name2);
	}
	FileOutputStream fos = new FileOutputStream(f);
	book.write(fos);
	}
//findNumOfRowsAndCells
public static void findNumOfRowsAndCells(int m, int n) throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book2.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sh = book.getSheet("Sheet1");
	int numberOfRows = sh.getPhysicalNumberOfRows();
	System.out.println("Number of Rows:" +numberOfRows);
	Row r = sh.getRow(m);
	int numberOfCells = r.getPhysicalNumberOfCells();
	System.out.println("Number of cells:" +numberOfCells);
	Cell c = r.getCell(n);
	}
//toPrintAllValuesFromExcel
public static void printAllValuesFromExcel() throws IOException {
	File f = new File("C:\\Users\\DivyaGanesh\\eclipse-workspace\\MavenProject\\Excel\\Book2.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fis);
	Sheet sh = book.getSheet("Sheet1");
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row r = sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell cl = r.getCell(j);
			int type = cl.getCellType();
			if (type==1) {
				String stringValue = cl.getStringCellValue();
				System.out.println(stringValue);
			}
			else if (DateUtil.isCellDateFormatted(cl)) {
				Date dates = cl.getDateCellValue();
				System.out.println(dates);
				SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
				String stringDate = form.format(dates);
				System.out.println(stringDate);
			}
			else {
				double d = cl.getNumericCellValue();
				System.out.println(d);
				long lo = (long)d;
				System.out.println(lo);
				String stringNum = String.valueOf(lo);
				System.out.println(stringNum);
			}
		}
	}
	
	

}


}
