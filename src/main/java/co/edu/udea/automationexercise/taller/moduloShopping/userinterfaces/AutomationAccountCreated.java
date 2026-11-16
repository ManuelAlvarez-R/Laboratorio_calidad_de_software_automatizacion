package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationAccountCreated {
    public static final Target CONTINUE = Target.the("Continue button")
            .locatedBy("//a[@data-qa='continue-button']");

    private AutomationAccountCreated() {}
}
