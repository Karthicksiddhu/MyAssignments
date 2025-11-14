package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTestLogin {
	public static void main (String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
		WebElement accountname = driver.findElement(By.id("accountName"));
		accountname.sendKeys("testing12345");
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("Selenium Automation Tester.");
		WebElement Industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDD = new Select (Industry);
		industryDD.selectByIndex(3);
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select OwnershipDD = new Select(ownership);
		OwnershipDD.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select sourceDD = new Select (Source);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketingDD = new Select (marketing);
		marketingDD.selectByIndex(6);
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateDD = new Select(state);
		stateDD.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		WebElement accountnumber = driver.findElement(By.partialLinkText("testing12345"));
		if (accountnumber.equals(accountnumber))
			System.out.println("Account number is verified  ");
		else {
			System.out.println("Account number is not verified  ");
			
		
		

		}
		driver.close();
	}
}

		
		
		
	

				