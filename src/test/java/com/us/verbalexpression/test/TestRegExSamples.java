package com.us.verbalexpression.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.us.verbalexpression.RegExSamples;

@DisplayName("VariableExpression Test Cases")
public class TestRegExSamples {
	

	private static RegExSamples regExSamples;
	
	@BeforeAll
	static void init(){
		regExSamples = new RegExSamples();
	}

	
	@DisplayName("Test if 2348907651230 is valid nigeria mobile number")
	@Test
	public void testMobileNumber(){
		String mobileNumber = "2348907651230";
		boolean validateMobileNumber = regExSamples.validateMobileNumber(mobileNumber);
		Assertions.assertTrue(validateMobileNumber);
	}
	
	@DisplayName("Test if 2358907651230 is invalid nigeria mobile number")
	@Test
	public void testMobileNumber2(){
		String mobileNumber = "2358907651230";
		boolean validateMobileNumber = regExSamples.validateMobileNumber(mobileNumber);
		Assertions.assertFalse(validateMobileNumber);
	}
}
