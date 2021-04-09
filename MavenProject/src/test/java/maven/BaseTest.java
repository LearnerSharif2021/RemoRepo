package maven;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class BaseTest {
	
	WebDriver dr;
	@Before
	public void start() throws IOException {
		
		//from properties file
		Properties prop=Shared.readProp("C:\\Users\\shafi\\eclipse-workspace\\MyFirstJavaProject\\MavenProject");
		String b=prop.getProperty("browser");
		if(b.equals("chrome")) {
			System.out.println("chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Downloads\\Selenium software\\chromedriver.exe");	
		}else if(b.equals("firefox")) {
			System.out.println("firefox");
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\shafi\\Downloads\\Selenium software\\firefoxdriver.exe");
		}else if(b.equals("msedge")) {
			System.out.println("msedge");
			System.setProperty("webdriver.msedge.driver", "C:\\Users\\shafi\\Downloads\\Selenium software\\firefoxdriver.exe");
		}
		
		
	}
	
	
	
	

}
