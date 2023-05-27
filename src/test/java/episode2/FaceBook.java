package episode2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import episode1.BaseClass;

public class FaceBook extends BaseClass {

	public static void main(String[] args) throws IOException {

        // if i dont want to create object for base class so i make the all the methods in baseclass as static
		
		getDriver("chrome");
		
		launchUrl("https://www.facebook.com/login/");
		
		WebElement username = id("email");
		
		typeText(username, "kamal");
		
		WebElement password = id("pass");
		
		typeText(password, "Welcome%$2022");
		
		WebElement btnlogin = name("login");
		
		btnClick(btnlogin);
		
		
		
		
		
		
		
		
		
		
		
		
		/*BaseClass baseClass = new BaseClass();
		
		baseClass.getDriver("chrome");
		
		baseClass.launchUrl("https://www.facebook.com/login/");
		
		WebElement username = baseClass.id("email");
		
		baseClass.typeText(username, "kamal");
		
		WebElement password = baseClass.id("pass");
		
		baseClass.typeText(password, "9843869");
		
		WebElement loginbtn = baseClass.name("login");
		
		//baseClass.btnClick(loginbtn);
		
		
		
		baseClass.quitBrowser();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement findElement2 = driver.findElement(By.id("email"));
		
		baseClass.typeText(findElement2, "kamal");
		
		
		WebElement findElement3 = driver.findElement(By.id("pass"));
		
		baseClass.typeText(findElement3, "984685");
		
		driver.findElement(By.)*/
		
		
		
		

	}

}
