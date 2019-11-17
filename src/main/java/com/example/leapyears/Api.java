/*******************************************************************************
 * Api.java, created on 17.11.2019
 *
 * This file is part of com.example.leapyears.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.leapyears;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TAF skunze
 */
@RestController
public class Api {

	@GetMapping(path = "/{year}")
	public String testLeapYear(@PathVariable("year") Integer year) {
		boolean result = new LeapYearChecker().isLeapYear(year);
		return result ? "true" : "false";
	}

}
