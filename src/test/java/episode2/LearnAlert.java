package episode2;

import org.openqa.selenium.WebElement;

import episode1.BaseClass;

public class LearnAlert {

	public static void main(String[] args) {
		
	BaseClass baseClass = new BaseClass();	
	
	baseClass.getDriver("chrome");
		
	baseClass.launchUrl("https://letcode.in/alert");
	
	WebElement simpleAlert = baseClass.xpaths("//button[@id='accept']");
	
	baseClass.btnClick(simpleAlert);
	
	baseClass.alertAccpt();
	
	WebElement id = baseClass.id("confirm");
	
	baseClass.btnClick(id);
	
	baseClass.alertAccpt();
	
	WebElement id2 = baseClass.id("prompt");
	
	baseClass.btnClick(id2);
	
	baseClass.alertSendText("kamal");
	
	baseClass.alertAccpt();
	
	
	
	
	
	
	
	
	
	
	
		
	baseClass.closeBrowser();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
