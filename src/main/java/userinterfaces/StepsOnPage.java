package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StepsOnPage {
    public static final Target HELP_ORDER= Target.the("Button to go to the search by order").located(
            By.id("tab_search_order"));
    public static final Target HELP_ORDER_SHOW= Target.the("Button to go to the help of search by order").located(
            By.id("undefined-dialog-open"));
    public static final Target TEXT_TO_EXPLORE= Target.the("Text where we goint to search the code of six digits").located(
            By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/button[2]/div[2]"));

}
