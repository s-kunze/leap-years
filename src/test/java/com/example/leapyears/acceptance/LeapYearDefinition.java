/*******************************************************************************
 * StepDefinition.java, created on 17.11.2019
 *
 * This file is part of com.example.leapyears.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.leapyears.acceptance;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author TAF skunze
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LeapYearDefinition {

	@Autowired
	private TestRestTemplate testRestTemplate;

	private ResponseEntity<String> resultIsLeapYear;

	@Given("^A user$")
	public void a_user() throws Throwable {
	}

	@When("^he wants to know if the year (.*) is a leap year$")
	public void he_wants_to_know_if_the_year_something_is_a_leap_year(String year) throws Throwable {
		resultIsLeapYear = testRestTemplate.getForEntity("/{year}", String.class, year);
	}

	@Then("^it must return (.*)$")
	public void it_must_return_something(String result) throws Throwable {
		assertThat(resultIsLeapYear.getBody()).isEqualTo(result);
	}

}
