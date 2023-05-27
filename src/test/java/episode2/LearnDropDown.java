package episode2;

import org.openqa.selenium.WebElement;

import episode1.BaseClass;

public class LearnDropDown {

	public static void main(String[] args) {
		
		
		BaseClass baseClass = new BaseClass();
		
		baseClass.getDriver("chrome");
		
		baseClass.launchUrl("https://letcode.in/dropdowns");
		
		WebElement id = baseClass.id("fruits");
		
		baseClass.selectByIndex(id, 2);
		
		WebElement id2 = baseClass.id("superheros");
		
		baseClass.selectByVisibleText(id2, "Batman");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
