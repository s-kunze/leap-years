/*******************************************************************************
 * StepDefinition.java, created on 17.11.2019
 *
 * This file is part of com.example.leapyears.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.leapyears.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author TAF skunze
 */
public class StepDefinition {

	@Given("^A user$")
	public void a_user() throws Throwable {
		throw new RuntimeException();
	}

	@When("^he wants to know if the year \"([^\"]*)\" is a leap year$")
	public void he_wants_to_know_if_the_year_something_is_a_leap_year(String year, String strArg1) throws Throwable {
		throw new RuntimeException();
	}

	@Then("^it must return \"([^\"]*)\"$")
	public void it_must_return_something(String result, String strArg1) throws Throwable {
		throw new RuntimeException();
	}

}
