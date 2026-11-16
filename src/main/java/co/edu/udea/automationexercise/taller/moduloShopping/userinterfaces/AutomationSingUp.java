package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationSingUp {
    public static final Target MR = Target.the("Title Mr")
            .located(By.id("id_gender1"));

    public static final Target MRS = Target.the("Title Mrs")
            .located(By.id("id_gender2"));

    public static final Target NAME = Target.the("Name")
            .located(By.id("name"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));

    public static final Target DAYS = Target.the("Day of birth")
            .located(By.id("days"));

    public static final Target MONTHS = Target.the("Month of birth")
            .located(By.id("months"));

    public static final Target YEARS = Target.the("Year of birth")
            .located(By.id("years"));

    public static final Target NEWSLETTER = Target.the("Newsletter")
            .located(By.id("newsletter"));

    public static final Target OFFERS = Target.the("Special offers")
            .located(By.id("optin"));

    public static final Target FIRST_NAME = Target.the("First name")
            .located(By.id("first_name"));

    public static final Target LAST_NAME = Target.the("Last name")
            .located(By.id("last_name"));

    public static final Target COMPANY = Target.the("Company")
            .located(By.id("company"));

    public static final Target ADDRESS = Target.the("Address")
            .located(By.id("address1"));

    public static final Target ADDRESS_2 = Target.the("Address 2")
            .located(By.id("address2"));

    public static final Target COUNTRY = Target.the("Country")
            .located(By.id("country"));

    public static final Target STATE = Target.the("State")
            .located(By.id("state"));

    public static final Target CITY = Target.the("City")
            .located(By.id("city"));

    public static final Target ZIPCODE = Target.the("Zipcode")
            .located(By.id("zipcode"));

    public static final Target MOBILE_NUMBER = Target.the("Mobile number")
            .located(By.id("mobile_number"));

    public static final Target CREATE_ACCOUNT = Target.the("Create Account")
            .locatedBy("//button[@data-qa='create-account']");

    private AutomationSingUp() {}
}