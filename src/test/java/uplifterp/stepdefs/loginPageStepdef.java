package uplifterp.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uplifterp.pages.Login;
import uplifterp.utilities.ConfigurationReader;
import uplifterp.utilities.Driver;

public class loginPageStepdef {

    @When("the user enters {string} {string}")
    public void the_user_enters(String string, String string2) {
        Login lgn = new Login();
        lgn.login(string,string2);

    }

    @Then("the user should able to login {string}")
    public void the_user_should_able_to_login(String string) {
        String actTitle = Driver.get().getTitle();
        Assert.assertEquals(string,actTitle);
    }

    @Given("Given the user is on the login page")
    public void givenTheUserIsOnTheLoginPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
}
