package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// email id - testleaf.2023@gmail.com
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		Thread.sleep(1000);
		String title= driver.getTitle();
		if (title.contains("Forgotten")) {
			System.out.println("title is verified :" + title);
			
		}
		else {
			System.out.println("Page not naviagted : "  + title);
		}
		
		
		

	}

}
