/*******************************************************************************
 * LeapYearChecker.java, created on 17.11.2019
 *
 * This file is part of com.example.leapyears.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.leapyears;

/**
 * @author TAF skunze
 */
public class LeapYearChecker {

	/**
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(Integer year) {
		if (isDivisableBy400(year)) {
			return true;
		}

		if (isDivisableBy4AndNot100(year)) {
			return true;
		}

		return false;
	}

	/**
	 * @param year
	 * @return
	 */
	private boolean isDivisableBy4AndNot100(Integer year) {
		return year % 4 == 0 && year % 100 != 0;
	}

	/**
	 * @param year
	 * @return
	 */
	private boolean isDivisableBy400(Integer year) {
		return year % 400 == 0;
	}

}
