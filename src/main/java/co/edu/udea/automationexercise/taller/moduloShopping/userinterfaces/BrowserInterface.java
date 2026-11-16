package co.edu.udea.automationexercise.taller.moduloShopping.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BrowserInterface {
    public static final Target SEARCH_BAR = Target.the("Google search bar")
            .located(By.name("q"));

    public static final Target STORE_RESULT = Target.the("Automation Exercise result")
            .located(By.xpath("//a[.//h3[text()='Automation Exercise']]"));

    private BrowserInterface(){


    }
}
