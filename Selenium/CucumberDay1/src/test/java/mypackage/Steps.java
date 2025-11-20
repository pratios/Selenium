package mypackage;

import io.cucumber.java.en.Given;

public class Steps {

	@Given("Open Browser")
	public void OpenBrowser() {
		System.out.println("Calling Open browser Function");
	}
}
