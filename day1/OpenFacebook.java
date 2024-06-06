package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define new object and its cloning from ChromeDriver class from Maven dependencies
ChromeDriver driver = new ChromeDriver();

// maximize the screen
driver.manage().window().maximize();

// open the url

driver.get("https://www.facebook.com/");

//close the browser

driver.close();

	}

}
