package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize(); //maximize window

driver.get("https://www.leafground.com/select.xhtml"); //open url

WebElement ddlist = driver.findElement(By.className("ui-selectonemenu")); // find dropdown locator and store all values of dropdown

Select options = new Select(ddlist); //define new object called options from select class

//System.out.println("List of dropdown values: " +ddlist);

Thread.sleep(2000);

options.selectByIndex(3); //select option puppeteer

Thread.sleep(2000);

//options.selectByValue(null);

options.selectByVisibleText("Cypress");

Thread.sleep(4000);

driver.close();

	}

}
