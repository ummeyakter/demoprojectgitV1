package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Ebay {
	
	@Before
	public void launchbrowser() {
		System.out.println("launch the browser");
	}
	@After
	public void closebrowser() {
		System.out.println("browser close and take screenshot");
	}
	
	@Given("launch the {string} browser")
	public void launch_the_browser(String string) {
	   System.out.println("The input parameter string is" + string);
	}

	@Then("go to the url {string};")
	public void go_to_the_url(String string) {
	 System.out.println("The string for url"+ string);  
	}

	@When("i landed on homepage")
	public void i_landed_on_homepage() {
	  System.out.println("explicit wait to locate element");
	  System.out.println("verify the homepage url according to frs");
	}

	@Then("i entered following character in the search field {string}")
	public void i_entered_following_character_in_the_search_field(String string){
	   System.out.println("The string value is"+ string);
	}

	@And("i click on search field")
	public void i_click_on_search_field() {
	   System.out.println("click on the search icon");
	}

	@Then("the result according to keyword results for <NOR> displays on the screen")
	public void the_result_according_to_keyword_results_for_nor_displays_on_the_screen()  {
	    System.out.println("assert the following result");
	}


}
