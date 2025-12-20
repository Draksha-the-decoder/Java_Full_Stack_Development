package com.service;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {

	@ParameterizedTest
	@ValueSource(strings = { "madam", "radar", "liril", "racecar" })
	void testIsPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actualResult = pc.isPalindrome(str);
		assertTrue(actualResult);
	}

}
