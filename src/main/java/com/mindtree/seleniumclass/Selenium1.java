package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class Selenium1 {

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		//Implicit 
		action.moveToElement(driver.findElement(By.linkText("Personal Finance"))).build().perform();
		driver.findElement(By.linkText("Income Tax Calculator")).click();
		
		//driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']")).click();
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("24");
		//4
		Select se= new Select(driver.findElement(By.id("resi_status")));
		se.selectByVisibleText("Stay in non Metro City");
		
		
		//5
		driver.findElement(By.cssSelector("[title=Next]")).click();
		
		
		//6
		//driver.findElement(By.xpath("//input[@id='annual_salary']")).click();
		driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("15000");
		//driver.findElement(By.xpath("//input[@id='other_income']")).click();
		driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("15000");
		driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
		
		//7
		//driver.findElement(By.xpath("//input[@id='tax_saving_investment']")).click();
		driver.findElement(By.xpath("//input[@id='tax_saving_investment']")).sendKeys("2000");
		driver.findElement(By.cssSelector("title=Next")).click();
		
		
		//8
		WebElement paid = driver.findElement(By.className("summary_text"));
		System.out.println(paid.getText());
		
		//9
		action.moveToElement(driver.findElement(By.linkText("Mutual Funds"))).build().perform();
		driver.findElement(By.linkText("Top Ranked Funds"));
		
		//10
		
		driver.findElement(By.cssSelector("rodo_medium")).click();
		
		//11
		
		
		

	}

}
