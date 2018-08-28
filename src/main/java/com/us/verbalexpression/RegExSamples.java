package com.us.verbalexpression;

import ru.lanwen.verbalregex.VerbalExpression;

public class RegExSamples {

	public boolean validateMobileNumber(String mobilenumber){
		VerbalExpression testRegex = VerbalExpression.regex()
				.startOfLine()
				.then("234")
				.capture().range("0","9").count(10).endCapture()
				.endOfLine().build();
		boolean testExact = testRegex.testExact(mobilenumber);
		System.out.println(testExact);
		return testExact;
	}

}
