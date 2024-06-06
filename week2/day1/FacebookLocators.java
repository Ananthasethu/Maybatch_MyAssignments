package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		// maximize the screen
		driver.manage().window().maximize();

		// open the url

		driver.get("https://www.facebook.com/");
		
		
		// find element for Forgot password link
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//driver.findElement(By.id("login_link")).click();
		
		

		// find element username and send username details
		driver.findElement(By.id("email")).sendKeys("ananthasethu@yahoo.com");
		
		// find element password and send password details
		driver.findElement(By.id("pass")).sendKeys("Testleaf@2024");
		
				
		// find element button and send user action click
		driver.findElement(By.name("login")).click();
		
		//Find the title
		
	String title = driver.getTitle();
		
	if(title.contains("Face")) {
		System.out.println("Title is correct");
	}
	else {
		System.out.println("Ittle is not correct");
	}
		//Screen wait
		Thread.sleep(3000);
		//close the browser
		
		driver.close();
	}

}
