package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.StepsOnPage;


public class Fill implements Task {
    public static Performable the() {
        return Tasks.instrumented(
                Fill.class, new Object[0]
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(new Performable[]{
              Click.on(StepsOnPage.HELP_ORDER),
              Click.on(StepsOnPage.HELP_ORDER_SHOW)
      });

    }
}
