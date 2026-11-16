package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationCheckout {
    public static final Target COMMENT = Target.the("Comment about the order")
            .located(By.name("message"));

    public static final Target PLACE_ORDER = Target.the("Place Order button")
            .locatedBy("//a[@href='/payment']");

    private AutomationCheckout() {}
}
