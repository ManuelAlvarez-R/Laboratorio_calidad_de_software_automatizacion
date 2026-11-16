package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationViewCart {
    public static final Target PRODUCT = Target.the("Product in the cart")
            .locatedBy("//td[@class='cart_description']//a[text()='{0}']");

    public static final Target REMOVE_PRODUCT = Target.the("Remove product button")
            .locatedBy("//tr[td[@class='cart_description']//a[text()='{0}']]//a[contains(@class,'cart_quantity_delete')]");

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout button")
            .locatedBy("//a[contains(@class,'check_out')]");

    private AutomationViewCart() {}
}