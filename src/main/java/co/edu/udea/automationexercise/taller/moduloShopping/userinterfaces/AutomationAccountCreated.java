package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationAccountCreated {
    public static final Target CONTINUE = Target.the("Continue button")
            .locatedBy("//a[@data-qa='continue-button']");

    public static final Target ACCOUNT_CREATED = Target.the("Account created message")
            .locatedBy("//h2[@data-qa='account-created']");

    private AutomationAccountCreated() {}
}
