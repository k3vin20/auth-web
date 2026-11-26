package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.example.Questions.LoginExitoso;
import org.example.Utils.PreAndProsCondition;
import org.example.Utils.ScreenShot;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.Matchers.containsString;

public class LoginUser {

    @And("selecciona el boton de iniciar sesion")
    public void seleccionaElBotonDeIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_LOGIN));
        ScreenShot.captureScreenshot(getDriver(), PreAndProsCondition.screenShot, "Paso 1");
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string} para iniciar sesion")
    public void ingresaUnNombreDeUsuarioYContraseniaParaIniciarSesion(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(LoginPage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(LoginPage.INP_PASSWORD));
        ScreenShot.captureScreenshot(getDriver(), PreAndProsCondition.screenShot, "Paso 2");
    }

    @When("selecciona el boton iniciar sesion")
    public void seleccionaElBotonIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        ScreenShot.captureScreenshot(getDriver(), PreAndProsCondition.screenShot, "Paso 3");
    }

    @Then("inicia sesion de manera exitosa")
    public void iniciaSesionDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat("Mensaje de bienvenida", LoginExitoso.LoginExitoso(), containsString("Welcome")));
    }
}