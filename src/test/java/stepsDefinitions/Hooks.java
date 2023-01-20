package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;

public class Hooks {
	
	@Before
	public void setUp() throws Exception {
		acessarToDo();
	}
	
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();	
	}
}
