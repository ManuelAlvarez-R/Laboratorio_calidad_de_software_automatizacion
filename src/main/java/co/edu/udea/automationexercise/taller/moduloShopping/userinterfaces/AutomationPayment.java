package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPayment {
    public static final Target NAME_ON_CARD = Target.the("Name on card")
            .located(By.name("name_on_card"));

    public static final Target CARD_NUMBER = Target.the("Card number")
            .located(By.name("card_number"));

    public static final Target CVC = Target.the("CVC")
            .located(By.name("cvc"));

    public static final Target EXPIRY_MONTH = Target.the("Expiry month")
            .located(By.name("expiry_month"));

    public static final Target EXPIRY_YEAR = Target.the("Expiry year")
            .located(By.name("expiry_year"));

    public static final Target PAY_AND_CONFIRM_ORDER = Target.the("Pay and confirm order button")
            .located(By.id("submit"));

    private AutomationPayment() {}
}
