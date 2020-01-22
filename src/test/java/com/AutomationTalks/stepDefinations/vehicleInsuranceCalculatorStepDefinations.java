package com.AutomationTalks.stepDefinations;

import org.testng.annotations.Listeners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Listeners(com.AutomationTalks.Utils.ListnersClass.class)
public class vehicleInsuranceCalculatorStepDefinations {


	@When("^user opens required browser$")
	public void user_opens_required_browser(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("open browser");
	}

	@Given("^user is on vehicle insurance calculator homePage$")
	public void user_is_on_vehicle_insurance_calculator_homePage(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("homePage");

	}

	@When("^user enters vehicle Data$")
	public void user_enters_vehicle_Data(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("enter vehicle data");

	}

	@When("^use enters Insurant data$")
	public void use_enters_Insurant_data(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("enter insurant data");

	}

	@When("^user enters Product data$")
	public void user_enters_Product_data(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("enter product data");

	}

	@When("^user selects required insurance plan$")
	public void user_selects_required_insurance_plan(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("select insurant plan");

	}

	@Then("^verify the insurance premium for all given plans$")
	public void verify_the_insurance_premium_for_all_given_plans(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("verify premium");

	}

	@Then("^verify that user is able to send email notification with plan details\\.$")
	public void verify_that_user_is_able_to_send_email_notification_with_plan_details(){
		// Write code here that turns the phrase above into concrete actions
		System.out.println("send email");

	}


}
