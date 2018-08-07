package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Service.State;

public class AmazonHome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		ProductSelectionPage page1 = PageFactory.initElements(driver, ProductSelectionPage.class);
		page1.searchBox.sendKeys("one plus 5");
		Thread.sleep(5000);
		page1.searchButton.click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		page1.searchResult.click();
		Thread.sleep(5000);
		//when search result is clicked on, the result gets opened in a new tab
		String winHandleBefore = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		driver.get(
				"https://www.amazon.in/OnePlus-Mirror-Black-64GB-Memory/dp/B0756Z43QS/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533558289&sr=1-1&keywords=oneplus+5");
//		ProjectDetails page2 = PageFactory.initElements(driver, ProjectDetails.class);
		page1.addToCart.click();
		Thread.sleep(5000);
		page1.viewCart.click();
		page1.searchBox.sendKeys("carrom board");
		Thread.sleep(1000);
		page1.searchButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[1]")).click();
	}
}
