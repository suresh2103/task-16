package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");

		Thread.sleep(2000);

		WebElement open = driver.findElement(By.id("searchInput"));

		open.sendKeys("Artificial Intelligence");

		open.submit();

		Thread.sleep(2000);

		WebElement history = driver.findElement(By.linkText("History"));

		history.click();

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		driver.close();

	}

}

// output: Artificial intelligence - Wikipedia
