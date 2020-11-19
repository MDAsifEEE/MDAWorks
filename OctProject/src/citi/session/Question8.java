package citi.session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asifm\\git\\repository\\New\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = w.getCurrentUrl();
		System.out.println("CurrentUrl: " + currentUrl);
		Thread.sleep(1000);
		w.findElement(By.xpath("(//img[@title='arrow'])")).click();
		Thread.sleep(1000);
		//w.switchTo().frame(0);
		w.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("MDAsif");
		Thread.sleep(1000);
		w.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("***********");
		Thread.sleep(1000);
		w.findElement(By.xpath("(//input[@type='Submit'])[1]")).click();
	}

}
