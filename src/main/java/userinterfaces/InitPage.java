package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latamairlines.com/co/es")
public class InitPage extends PageObject {
    public static final Target MY_TRAVELS= Target.the("Button to go to my travels").located(By.className("kwNFGd"));
}
