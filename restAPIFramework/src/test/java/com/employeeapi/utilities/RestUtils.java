package com.employeeapi.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String empName() {

		String generateString = RandomStringUtils.randomAlphabetic(1);
		return ("Tam" + generateString);
	}

	public static String empSalary() {
		String generateString = RandomStringUtils.randomNumeric(5);
		return generateString;
	}

	public static String empAge() {
		String generateString = RandomStringUtils.randomNumeric(2);
		return generateString;
	}

}
