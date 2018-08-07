package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductSelectionPage {

	@FindBy(how = How.XPATH, using = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
	WebElement searchButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")
	WebElement searchResult;
	@FindBy(how = How.XPATH, using = "//*[@id=\"add-to-cart-button\"]")
	WebElement addToCart;
	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-cart\"]/span[2]")
	WebElement viewCart;
	  
		

	 

}
