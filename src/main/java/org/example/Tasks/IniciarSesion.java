package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {
    private final String username, password;

    public IniciarSesion(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static IniciarSesion conCredenciales(String username, String password){
        return Tasks.instrumented(IniciarSesion.class, username, password);
    }

    @Override
    public <T extends Actor>void performAs(T actor){
        actor.attemptsTo(
                Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(username).into(LoginPage.INP_USERNAME),
                Enter.theValue(password).into(LoginPage.INP_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN),
                WaitUntil.the(LoginPage.BIENVENIDA, isVisible()).forNoMoreThan(5).seconds());
    }
}