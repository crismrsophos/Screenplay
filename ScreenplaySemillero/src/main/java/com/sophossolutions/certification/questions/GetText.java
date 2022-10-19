package com.sophossolutions.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetText implements Question<String> {

	private Target target;

	public GetText(Target target) {
		super();
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).answeredBy(actor);
	}

	public static GetText theField(Target target) {
		return new GetText(target);
	}

}
