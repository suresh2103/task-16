package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		driver.close();

	}

}


//Console Output:https://www.google.com/