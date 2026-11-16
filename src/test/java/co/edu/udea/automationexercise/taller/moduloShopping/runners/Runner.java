package co.edu.udea.automationexercise.taller.moduloShopping.runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.edu.udea.automationexercise.taller.moduloShopping.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {}