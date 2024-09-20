package src;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static void oprnBrowser(String browserName) {

		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();

			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constant.driver = new FirefoxDriver();

			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constant.driver = new InternetExplorerDriver();

			break;

		default:
			System.out.println("Unable to open browser");
		}

	}

}
