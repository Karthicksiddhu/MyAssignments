package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().minimize();
		
		String title = driver.getTitle();
		if (title.contains("log in")) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Page not launched properly");
		}
		driver.close();
	}

}
