package com.example.leapyears;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LeapYearCheckerTest {

	private LeapYearChecker leapYearChecker = new LeapYearChecker();

	@Test
	public void given_aYear_When_itIsDivisibleBy400_Then_return_True() throws Exception {
		// given
		Integer year = 2000;

		// when
		boolean result = leapYearChecker.isLeapYear(year);

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void given_aYear_When_itIsDivisibleBy100AndNot400_Then_return_False() throws Exception {
		// given
		Integer year = 1700;

		// when
		boolean result = leapYearChecker.isLeapYear(year);

		// then
		assertThat(result).isFalse();
	}

	@Test
	public void given_aYear_When_itIsDivisibleBy4AndNot100_Then_return_True() throws Exception {
		// given
		Integer year = 2008;

		// when
		boolean result = leapYearChecker.isLeapYear(year);

		// then
		assertThat(result).isTrue();
	}

}
