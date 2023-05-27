package episode1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.math3.ode.events.FieldEventHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Alert alert;
	public static ChromeDriver chromedriver;
	public static WebElement findElement;


	//1.maximize the window
	public static void windowMaximize() {

		driver.manage().window().maximize();

	}

	// 2.launch browser
	public static void getDriver(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			windowMaximize();
			break;
		case "firefox" :

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			windowMaximize();
			break;
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			windowMaximize();
			break;
		case "opera":
			WebDriverManager.operadriver().setup();
			driver =new OperaDriver();
			windowMaximize();
		default:
			System.out.println("Invalid Browser Name");
			break;
		}


	}

	// 3.launch url
	public static void launchUrl(String url) {
    
		driver.get(url);

	}


	// 4.Method for sendkeys
	public static void typeText(WebElement ele, String data) {

		ele.sendKeys(data);

	}

	// 5.click function
	public static void btnClick(WebElement ele) {
       
		
		ele.click();

	}


	// 6.To get Title of WebPage
	public static void getTitle() {

		String title = driver.getTitle();
		System.out.println(title);


	}
	// 7
	public static void getcurrentUrl() {

		String currentUrl = driver.getCurrentUrl();

	}
	// 8
	public static void quitBrowser() {

		driver.quit();

	}

	// 9
	public static void closeBrowser() {

		driver.close();
	}

	// 10
	public static WebElement id(String locator) {

		WebElement findElement = driver.findElement(By.id(locator));
        return findElement;
	}
	// 11
	public static WebElement name(String name) {

		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}
	// 12
	public static void classname(String classname) {

		WebElement findElement = driver.findElement(By.className(classname));

	}
	// 13
	public static WebElement xpaths(String xpath) {

		WebElement findElement = driver.findElement(By.xpath(xpath));
        return findElement;
	}
	// 14
	public static void tagname(String tagname) {

		WebElement findElement = driver.findElement(By.tagName(tagname));


	}
	// 15
	public static void linkText(String linkText) {

		driver.findElement(By.linkText(linkText));

	}
	// 16
	public static void partiallinkText(String partialLinkText) {

		driver.findElement(By.partialLinkText(partialLinkText));

	}

	//17
	public static void cssSelector(String cssSelector) {

		driver.findElement(By.cssSelector(cssSelector));

	}
	// 18
	public static void getText(WebElement element) {

		String tagName = element.getTagName();
		System.out.println(tagName);
	}
	// 19
	public static void getAttribute(WebElement ele, String attribute) {

		String attribute2 = ele.getAttribute(attribute);
		System.out.println(attribute2);



	}
	// 20
	public static void movetoElement(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();

	}
	// 21
	public static void dragAndDrop(WebElement source, WebElement target) {

		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();

	}
	// 22
	public static void doubleclick(WebElement ele) {

		Actions ac = new Actions(driver);

		ac.doubleClick(ele).perform();

	}

	// 23
	public static void rightClick(WebElement ele) {

		Actions ac =new Actions(driver);

		ac.contextClick(ele).perform();

	}
	// 24
	public static void alertAccpt() {

		alert = driver.switchTo().alert();
		alert.accept();
	}
	// 25
	public static void alertDismiss() {

		alert = driver.switchTo().alert();
		alert.dismiss();


	}
	// 26
	public static void alertSendText(String Text) {

		alert = driver.switchTo().alert();
		alert.sendKeys(Text);

	}
	// 27
	public static void alertgetText() {

		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

	}
	// 28
	public static void isdispaled(WebElement ele) {

		boolean displayed = ele.isDisplayed();
		System.out.println(" displayed is "+ displayed);

	}
	// 29
	public static void isenabled(WebElement ele) {

		boolean enabled = ele.isEnabled();
		System.out.println(" enabled is"+enabled);

	}
	// 30
	public static void isselected(WebElement ele) {

		boolean selected = ele.isSelected();
		System.out.println("selected is "+selected);

	}
	// 31
	public static void switchToFrameIndex(int index) {

		WebDriver frame = driver.switchTo().frame(index);

	}
	// 32
	public static void switchToFrameString(String name) {

		WebDriver frame = driver.switchTo().frame(name);

	}
	// 33
	public static void switchToFrameElement(WebElement ele) {

		WebDriver frame = driver.switchTo().frame(ele);

	}
	// 34
	public static void switchToFrameId(String id) {

		WebDriver frame = driver.switchTo().frame(id);

	}
	// 35
	public static void implicitWait(long sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// 36
	public static void findElements(String xpath) {

		List<WebElement> findElements = driver.findElements(By.xpath(xpath));


	}

	// 37
	public static void navigateToUrl(String url) {

		driver.navigate().to(url);

	}
	// 38
	public static void navigateForward() {

		driver.navigate().forward();

	}
	// 39
	public static void navigateBack() {

		driver.navigate().back();
	}

	// 40
	public static void refresh() {

		driver.navigate().refresh();

	}


	public static void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement element, String visibleText) {

		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}


	//Take Screeshot
	public static void getScreenShot(String pathname) throws IOException {

		File screenshotAs = chromedriver.getScreenshotAs(OutputType.FILE);

		File file =new File(pathname);

		org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);

	}

	public static void switchToFrameByIndex(int index) {

		driver.switchTo().frame(index);

	}

	public static void switchToFrameByname(String name) {
		
		driver.switchTo().frame(name);

	}

	public static void switchToFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

    public static void switchToParentFrame() {
		
    	driver.switchTo().parentFrame();
	}

    
    public   static void getToolTip(WebElement element) {
		
    	getAttribute(element, "title");

	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}












