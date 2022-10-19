package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.LoginSauceDemoPage.BTN_LOGIN;
import static com.sophossolutions.certification.userinfaces.LoginSauceDemoPage.PASSWORD;
import static com.sophossolutions.certification.userinfaces.LoginSauceDemoPage.USER_NAME;

import com.sophossolutions.certification.models.UserCredential;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login implements Task {

	private String user;
	private String password;
	private Target btnLogin;

	public Login(UserCredential credentials) {
		super();
		user = credentials.getUser();
		password = credentials.getPassword();
		btnLogin = BTN_LOGIN;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(USER_NAME), Enter.theValue(password).into(PASSWORD),
				Click.on(btnLogin));
	}

	public static Login in(UserCredential credentials) {
		return Tasks.instrumented(Login.class, credentials);
	}

}
