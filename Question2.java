package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {

		String expectTitle = "STORE";
		String actualTitle = null;

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");

		actualTitle = driver.getTitle();

		if (expectTitle.equals(actualTitle)) {

			System.out.println("Page landed on correct website");
		}

		else {

			System.out.println("Page not landed on correct website");
		}

		driver.close();
	}

}

//Console Output:Page landed on correct web site
