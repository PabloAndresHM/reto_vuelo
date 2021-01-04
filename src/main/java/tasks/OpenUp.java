package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.InitPage;

public class OpenUp implements Task {
    InitPage initialPage;
    public static Performable thePage() {
        return Tasks.instrumented(
                OpenUp.class, new Object[0]
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{
                Open.browserOn(this.initialPage),
                Click.on(InitPage.MY_TRAVELS)

        });

    }
}
