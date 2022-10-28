package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.UtesPassword;
import com.sophossolutions.certification.models.UtestUserAddres;
import com.sophossolutions.certification.models.UtestUserInfo;
import com.sophossolutions.certification.tasks.UTestAddres;
import com.sophossolutions.certification.tasks.UTestHome;
import com.sophossolutions.certification.tasks.UTestPersonalInfo;
import com.sophossolutions.certification.tasks.UtestUserPassword;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {



    @When("suministra los siguientes datos")
    public void suministraLosSiguientesDatos(UtestUserInfo Uinfo) {
        theActorInTheSpotlight().attemptsTo(UTestPersonalInfo.in(Uinfo));
    }
    @When("suministra los datos de direccion")
    public void suministraLosDatosDeDireccion(UtestUserAddres Adress) {
        theActorInTheSpotlight().attemptsTo(UTestAddres.in(Adress));
    }

   @When("suministra la contraseña")
    public void suministraLaContraseña(UtesPassword Password) {
       theActorInTheSpotlight().attemptsTo(UtestUserPassword.in(Password));
   }



}
