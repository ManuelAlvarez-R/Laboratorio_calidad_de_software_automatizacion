package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationHome {
    public static final Target SIGNUP_LOGIN = Target.the("Signup or Login button")
            .locatedBy("//a[@href='/login']");

    public static final Target CART = Target.the("Cart button")
            .locatedBy("//a[@href='/view_cart']");

    public static final Target ADD_TO_CART = Target.the("Add to cart button")
            .locatedBy("//div[@class='overlay-content'][p[text()='{0}']]/a[contains(@class,'add-to-cart')]");

    public static final Target CONTINUE_SHOPPING = Target.the("Continue Shopping")
            .locatedBy("//button[contains(@class,'close-modal')]");

    private AutomationHome() {}
}