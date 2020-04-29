package stepDefination;



import static org.testng.Assert.assertTrue;



import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import scenarios.AutomatedScenarios;

public class stepsMap {
	public static AutomatedScenarios automate;
	
	@Given("^Chrome Browser$")
	public void launch_chrome() {
		try {			
			automate=new AutomatedScenarios();
			automate.launchBrowser();
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	
	@And("BarqStaging website")
	public void barqtstaging_website_openned() {
		System.out.println("website opened");
	}
	
	@When("^login$")
	public void openWebsite_login() {
		try {
			automate.login();
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	
	@And("open departments entity")
	public void department_entity() {
		System.out.println("Department entity opened");
	}
	
	@And("press \"New\" button")
	public void new_button_pressed() {
		System.out.println("New button pressed");
	}
	
	@Then("new Department entity will be displayed")
	public void new_dept_opened() {
		System.out.println("New department is opened successfully.");
	}
	
	@Given("new Department screen")
	public void openEntiy_pressNew(){
		try {
			automate.navigateToDept();
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	
	@When("filling data")
	public void filling_date() {
		System.out.println("Filling data in progress...");
	}
	
	@And("save")
	public void entering_data_And_Save(){
		try {
		automate.newDeptRecord();
		assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	
	@Then("record will be created")
	public void is_record_created() throws InterruptedException {
		Assert.assertEquals(automate.isCreated(), true);
	}
	
	
	
	
}
