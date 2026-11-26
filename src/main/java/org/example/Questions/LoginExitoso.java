package org.example.Questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.Pages.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginExitoso {
    public static Question<String> LoginExitoso(){
        return actor -> {
            actor.attemptsTo(
                    WaitUntil.the(LoginPage.BIENVENIDA, isVisible()).forNoMoreThan(10).seconds()
            );
            return Text.of(LoginPage.BIENVENIDA).answeredBy(actor);
        };
    }
}