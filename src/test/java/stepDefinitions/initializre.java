package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class initializre extends Base{
	
	@Before
	public void beforHooks(Scenario scenario) {
		Logger.info("Scenario " + scenario.getName() + " Started");
		scenario.log("Scenario " + scenario.getName() + " Started");
		selectBrowser();
		openBrowser();
		}

	@After 
	public void afterHooks(Scenario scenario) {

		tearDown();
		Logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		scenario.log("Scenario " + scenario.getName() + " " + scenario.getStatus());
	

	}

}

