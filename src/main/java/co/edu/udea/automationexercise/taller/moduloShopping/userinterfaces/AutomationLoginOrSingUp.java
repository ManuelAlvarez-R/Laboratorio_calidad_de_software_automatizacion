package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationLoginOrSingUp {
    public static final Target NAME = Target.the("Signup name")
            .locatedBy("//input[@data-qa='signup-name']");

    public static final Target EMAIL = Target.the("Signup email")
            .locatedBy("//input[@data-qa='signup-email']");

    public static final Target SIGNUP_BUTTON = Target.the("Signup button")
            .locatedBy("//button[@data-qa='signup-button']");

    private AutomationLoginOrSingUp() {}
}