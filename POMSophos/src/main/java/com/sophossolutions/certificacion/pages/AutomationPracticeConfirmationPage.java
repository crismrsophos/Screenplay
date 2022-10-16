package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;

public class AutomationPracticeConfirmationPage extends PageObject{

    By agregarCantidadCamiseta = By.xpath("//*[@id='quantity_wanted_p']/a[2]/span");
    By colorCamisetaAzul = By.xpath("//*[@id='color_2']");
    By camisetaTallaM= By.xpath("//*[@id='group_1']/option[2]");
    By btnAgregarCarrito = By.xpath("//*[@id='add_to_cart']/button/span");
    By btnContinuarCompraOrdenCompra = By.xpath("//*[@title='Proceed to checkout']");
    By btnContinuarCompraResumenCompra = By.xpath("//*[@title = 'Proceed to checkout']/span[text()='Proceed to checkout']");
    By email = By.xpath("//*[@id='email']");
    By password = By.xpath("//*[@id='passwd']");
    By btnInicioSesion = By.xpath("//*[@id='SubmitLogin']");
    By btnContinuarCompraDireccion = By.xpath("//*[@name='processAddress']");
    By chkBtnTerminosYCondiciones = By.xpath("//*[@id='uniform-cgv']");
    By btnContinuarCompraEnvio = By.xpath("//*[@name='processCarrier']");
    By btnPagoTransferenciaBancaria = By.xpath("//*[@title='Pay by bank wire']/span");
    By btnConfirmarOrden = By.xpath("//*[@class='button btn btn-default button-medium']/span");
    By montoExito = By.xpath("//*[@class='price']");
    int seconds = 10;

    public void procesoCompra(String _email, String _password){

        Action.waitForVisibility(getDriver(), colorCamisetaAzul, 10);
        Action.clicTo(getDriver(), colorCamisetaAzul);

        Action.waitForElement(getDriver(), agregarCantidadCamiseta, 10);
        Action.clicTo(getDriver(), agregarCantidadCamiseta);

        Action.waitForVisibility(getDriver(), camisetaTallaM, 10);
        Action.clicTo(getDriver(), camisetaTallaM);

        Action.waitForElement(getDriver(), btnAgregarCarrito, 10);
        Action.clicTo(getDriver(), btnAgregarCarrito);

        Action.waitForVisibility(getDriver(), btnContinuarCompraOrdenCompra, 10);
        Action.waitFor(getDriver(), Duration.ofSeconds(seconds));
        Action.clicTo(getDriver(), btnContinuarCompraOrdenCompra);

        Action.waitForElement(getDriver(), btnContinuarCompraResumenCompra, 10);
        Action.clicTo(getDriver(), btnContinuarCompraResumenCompra);

        Action.setText(getDriver(), email, _email);
        Action.setText(getDriver(), password, _password);
        Action.clicTo(getDriver(), btnInicioSesion);
        Action.clicTo(getDriver(), btnContinuarCompraDireccion);
        Action.clicTo(getDriver(), chkBtnTerminosYCondiciones);
        Action.clicTo(getDriver(), btnContinuarCompraEnvio);
        Action.clicTo(getDriver(), btnPagoTransferenciaBancaria);
        Action.clicTo(getDriver(), btnConfirmarOrden);
    }

    public void validarTextoCompra(String montoValidacion){
        Action.validateTextOfField(getDriver(), montoExito, montoValidacion);
    }
}