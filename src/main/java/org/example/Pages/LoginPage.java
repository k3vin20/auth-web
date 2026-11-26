package org.example.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INP_USERNAME = Target.the("Input para ingresar username")
            .located(By.id("loginusername"));

    public static final Target INP_PASSWORD = Target.the("Input para ingresar username")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .located(By.xpath("//button[text() = 'Log in']"));

    public static final Target BIENVENIDA = Target.the("Mensaje de bienvenida").located(By.id("nameofuser"));
}