package testing;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.awt.RenderingHints.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.engine.discovery.DiscoverySelectorResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import newRegistration.Project;
import newRegistration.User;

public class UserSteps {
	WebDriver driver;

	@Given("^I am having the redbus website$")
	public void i_am_having_the_redbus_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIl6jx_9XX3AIVDx0YCh2enQE-EAAYASAAEgJSMvD_BwE");
	}

	@When("^I am having the src as Pune and dest as Hyderabad$")
	public void i_am_having_the_src_as_Pune_and_dest_as_Hyderabad() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
	}

	@Then("^next page should be opened$")
	public void next_page_should_be_opened() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		Thread.sleep(3000);
	}
	@Given("^I am having the view seats option$")
	public void i_am_having_the_view_seats_option() throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[2]/div[1]")).click();
	}
	
	@When("^I click on the required seat$")
	public void i_click_on_the_required_seat() throws Throwable {
		/*driver.manage().window().maximize();*/
		Thread.sleep(5000);
		Actions builder= new Actions(driver);
		Action action=builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas")),60,30).click().build();
		action.perform();
				
	}

	@When("^select the boarding and dropping points$")
	public void select_the_boarding_and_dropping_points() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")).click();
		Thread.sleep(2000);
	}

	@Then("^control should proceed forward$")
	public void control_should_proceed_forward() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
	}

}
