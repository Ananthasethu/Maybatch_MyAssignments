package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		// maximize the screen
		driver.manage().window().maximize();

		// open the url

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ananthasethu@yahoo.com"); //find login textbox xpath using attribute
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Testleaf@2024"); //find password textbox xpath using attribute
		driver.findElement(By.xpath("//button[@name='login']")).click(); //find button xpath using attribute
		
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
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
				
		
	}

}
