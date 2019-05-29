package com.bae.painter.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class painterTest1 {
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardonw() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");

		Actions action = new Actions(driver);
		action.moveByOffset(500, 400).clickAndHold().moveByOffset(0, 100).release().moveByOffset(0, -50).clickAndHold()
				.moveByOffset(50, 50).release().moveByOffset(-50, -50).clickAndHold().moveByOffset(50, -50).release()
				.moveByOffset(50, 0).clickAndHold().moveByOffset(-25, 100).release().moveByOffset(25, -100)
				.clickAndHold().moveByOffset(25, 100).release().moveByOffset(-40, -30).clickAndHold()
				.moveByOffset(30, 0).release().moveByOffset(30, 30).clickAndHold().moveByOffset(0, -100)
				.moveByOffset(50, 0).moveByOffset(0, 50).moveByOffset(-50, 0).moveByOffset(50, 50).release()
				.moveByOffset(30, -100).clickAndHold().moveByOffset(0, 100).release().moveByOffset(30, 0).clickAndHold()
				.moveByOffset(50, 0).moveByOffset(0, -50).moveByOffset(-50, 0).moveByOffset(0, -50).moveByOffset(50, 0)
				.release().moveByOffset(30, 0).clickAndHold().moveByOffset(0, 100).release().moveByOffset(0, -50)
				.clickAndHold().moveByOffset(50, 0).release().moveByOffset(0, -50).clickAndHold().moveByOffset(0, 100)
				.release().moveByOffset(30, 0).clickAndHold().moveByOffset(0, -100).moveByOffset(50, 100)
				.moveByOffset(50, -100).moveByOffset(0, 100).release().moveByOffset(50, -100).clickAndHold()
				.moveByOffset(-25, 100).release().moveByOffset(25, -100).clickAndHold().moveByOffset(25, 100).release()
				.moveByOffset(-40, -30).clickAndHold().moveByOffset(30, 0).perform();

		Thread.sleep(500);
	}
}
