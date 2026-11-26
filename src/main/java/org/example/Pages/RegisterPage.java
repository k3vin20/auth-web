package org.example.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage{

    public static final Target INP_USERNAME = Target.the("Input para ingresar username")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target.the("Agregar para ingresar username")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTRAR = Target.the("Boton para registrar usuario")
            .located(By.xpath("//button[text() ='Sign up']"));

}
