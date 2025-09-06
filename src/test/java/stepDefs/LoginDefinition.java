package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginDefinition {

	int sum=0;

	@When("I add {int} and {int}")
	public void add(int a, int b) {
		sum = a+b;
		System.out.println(sum);
	}

	@Then("I validtae {int}")
	public void check(int c) {
        Assert.assertEquals(sum, c);
	}

}
