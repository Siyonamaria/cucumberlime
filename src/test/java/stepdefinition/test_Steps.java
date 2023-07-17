package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_Steps {
	WebDriver driver=new ChromeDriver();
	
	public void browser() {
		System.out.println(" I am inside the browser");}

	@Given("Launch the browser")
	public void launch_the_browser() {
		
		System.out.println(" I am inside the browser ");}

		
	

	@When("user open the url {string}")
	public void user_open_the_url(String string) {
		driver.get("https://www.limeroad.com/");
		System.out.println(" inside the step launch url");}

	

	@And("click on shop men")
	public void click_on_shop_men() {
		System.out.println(" inside the step click on shop men");}

	   
	

	@Then("user should see the products displayed for men")
	
	public void user_should_see_the_products_displayed_for_men() {
		System.out.println(" inside  the step user should see products displayed for men ");}

	}



