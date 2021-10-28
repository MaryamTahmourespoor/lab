package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.HotelHomePageObject;

public class TestStepDef extends Base {

	HotelHomePageObject hotelHomePage = new HotelHomePageObject();

	@Given("user is on hotel website")
	public void user_is_on_hotel_website() {
		String actualTitle = driver.getTitle();
		String expectedTitle = properties.getProperty("title");
		Assert.assertEquals(expectedTitle, actualTitle);
		Logger.info(actualTitle + " is egue to " + expectedTitle);
	}

	@When("user click on signIn button")
	public void user_click_on_sign_in_button() {
		hotelHomePage.clickSignIn();
		Logger.info("user cliked on signIn ");

	}

	@Then("user should see signIn page")
	public void user_should_see_sign_in_page() {
		Assert.assertTrue(hotelHomePage.isAuthenticationDisplayed());
		Assert.assertTrue(hotelHomePage.isEmailPresent());
		Logger.info(" sign is page is displayed");

	}

}
