package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	
WebDriver dr;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div[1]") WebElement menMenu;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/div[2]/nav/ol/li[2]/a") WebElement logo;



public HomePage(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
	
}
public void verifyHomePageLogo() {
	boolean b=Shared.verifyElement(logo);
	System.out.println(b);
}
public MenPage clickMenMenu() {
	Shared.click(menMenu);
	return new MenPage();
}

}
