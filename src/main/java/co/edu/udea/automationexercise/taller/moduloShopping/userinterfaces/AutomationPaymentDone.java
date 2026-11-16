package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationPaymentDone {
    public static final Target ORDER_PLACED = Target.the("Order placed message")
            .locatedBy("//h2[@data-qa='order-placed']");

    public static final Target CONTINUE = Target.the("Continue button")
            .locatedBy("//a[@data-qa='continue-button']");

    private AutomationPaymentDone() {}
}
