package stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import tasks.Fill;
import tasks.OpenUp;

public class RetoVueloStepDefinition {

    @Given("^(.*) is in the home page of latamairlines$")
    public void theUserIsInTheHomePageOfLatamairlines(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }


    @When("^he complete all the steps to see the code$")
    public void heCompleteAllTheStepsToSeeTheCode() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.the());

    }

    @Then("^he confirm that the code is of six digits$")
    public void heConfirmThatTheCodeIsOfSixDigits() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe(6)));

    }
    public RetoVueloStepDefinition() {
    }
}
