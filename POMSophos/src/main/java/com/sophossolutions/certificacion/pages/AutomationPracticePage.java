package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationPracticePage extends PageObject{

	//Pagina de entrada
	By btnShirts = By.xpath("//*[@id='block_top_menu']/ul/li/a[text() = 'T-shirts']");
	//Fin
	public void entradaPagina(String url){
		Action.navegateToUrl(getDriver(), url);
		Action.clicTo(getDriver(), btnShirts);
	}
}
