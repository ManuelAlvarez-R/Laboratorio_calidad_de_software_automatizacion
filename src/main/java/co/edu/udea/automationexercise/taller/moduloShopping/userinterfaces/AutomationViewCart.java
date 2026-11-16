package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationViewCart {
    public static final Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout button")
            .locatedBy("//a[contains(@class,'check_out')]");

    private AutomationViewCart() {}
}
