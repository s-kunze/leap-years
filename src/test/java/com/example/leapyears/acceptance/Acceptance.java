/*******************************************************************************
 * BDDTest.java, created on 17.11.2019
 *
 * This file is part of com.example.leapyears.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.leapyears.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author TAF skunze
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/acceptance/", plugin = {
	"pretty", "html:target/acceptance", "json:target/acceptance/cucumber.json", "junit:target/acceptance/cucumber.xml"
}, monochrome = true)
public class Acceptance {
}
