package org.example.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    public static final Target BTN_REGISTRAR = Target.the("Boton para hacer el registro")
            .located(By.id("signin2"));

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .located(By.id("login2"));

    public static Target PRODUCTO(String nombreProducto){
        return Target.the("Producto" + nombreProducto).located(By.xpath("//a[text() = '"+nombreProducto+"']"));
    }
}