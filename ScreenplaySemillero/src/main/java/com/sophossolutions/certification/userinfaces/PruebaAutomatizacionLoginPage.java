package com.sophossolutions.certification.userinfaces;
import net.serenitybdd.screenplay.targets.Target;


public class PruebaAutomatizacionLoginPage {

    public static final Target USUARIO = Target.the("nombre de usuario").locatedBy("//*[@typer='text']");
    public static final Target CONTRASEÑA = Target.the("contraseña").locatedBy("//*[@type='password']");

    public static final Target BTN_ENVIAR = Target.the("contraseña").locatedBy("//*[@type='submit']");
}
