package steps;


import common.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void abreNavegador() {
		Driver.abreNavegador();
	}

	@After
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}

}
