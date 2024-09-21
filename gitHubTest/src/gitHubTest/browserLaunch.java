package gitHubTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class browserLaunch {

	public static void main(String[] args) {
		
		//Chrome browser Launch
			//Setting the chromeDriver.exe path manually
			System.setProperty("webdriver.chrome.driver", "/Users/neera/OneDrive/Documents/Testing/Selenium/Udemy Selenium/Software/chromedriver-win64/chromedriver.exe");
			// Invoke browser
			WebDriver chdriver = new ChromeDriver();
			chdriver.get("https://demowebshop.tricentis.com/");
			
			System.out.println(chdriver.getTitle());
			System.out.println(chdriver.getCurrentUrl());
			//chdriver.close(); // closing the opened tab which is focussed and wont close all other tabs opened by driver.
			chdriver.quit(); // This will close all tabs and main window opened by driver object.
			
		
		//Firefox browser Launch
			//Setting the geckodriver.exe path manually
			System.setProperty("webdriver.gecko.driver", "/Users/neera/OneDrive/Documents/Testing/Selenium/Udemy Selenium/Software/FirefoxDriver/geckodriver.exe");
			// Invoke browser
			WebDriver ffdriver = new FirefoxDriver();
			ffdriver.get("https://demowebshop.tricentis.com/");
			
			System.out.println(ffdriver.getTitle());
			System.out.println(ffdriver.getCurrentUrl());
			ffdriver.quit();
			
			
		//Microsoft Edge browser Launch
			//Setting the Edgedriver.exe path manually
			System.setProperty("webdriver.edge.driver", "/Users/neera/OneDrive/Documents/Testing/Selenium/Udemy Selenium/Software/EdgeDriver/msedgedriver.exe");
			// Invoke browser
			WebDriver edgedriver = new EdgeDriver();
			edgedriver.get("https://demowebshop.tricentis.com/");
			
			System.out.println(edgedriver.getTitle());
			System.out.println(edgedriver.getCurrentUrl());
			
			edgedriver.quit();
			
	}	

}
