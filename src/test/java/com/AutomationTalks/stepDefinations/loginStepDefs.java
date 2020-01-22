package com.AutomationTalks.stepDefinations;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import com.AutomationTalks.Utils.InitClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Listeners(com.AutomationTalks.Utils.ListnersClass.class)
public class loginStepDefs extends InitClass {

    @Given("^user opens chrome browser$")
    public void user_opens_chrome_browser() throws Throwable {
    	System.out.println("open chrome browser");
    }
    
    @Given("^User opens demowebshop application$")
    public void user_opens_demowebshop_application() throws Throwable {
    	driver.navigate().to("http://demowebshop.tricentis.com/");
    }

    @When("^user navigates to login page$")
    public void user_navigates_to_login_page() throws Throwable {
    }

    @Then("^user sees login, password field and login button$")
    public void user_sees_login_password_field_and_login_button() throws Throwable {
    	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }

    @Then("^user login is success and user navigated to dashboard page\\.$")
    public void user_login_is_success_and_user_navigated_to_dashboard_page() throws Throwable {
    	System.out.println("login success");
    }

    @Then("^user login is failed with error message\\.$")
    public void user_login_is_failed_with_error_message() throws Throwable {
    	System.out.println("Login failed");
    }

    @And("^user enters valid username, valid password and hit enter button$")
    public void user_enters_valid_username_valid_password_and_hit_enter_button() throws Throwable {
    	System.out.println("user enters valid email and password");
    }

    @And("^user enters invalid username, invalid password and hit enter button$")
    public void user_enters_invalid_username_invalid_password_and_hit_enter_button() throws Throwable {
    	System.out.println("user enters invalid email and password");
    }

}
