package com.dank0851;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactorial {
	@Test
	@DisplayName("Tест факториала 5")
	void factorialFiveAssertTrueTest() {
		long factFive = Factorial.factorial(5);
		assertEquals(120, factFive);
	}

	@Test
	@DisplayName("Tест на факториал 5")
	void factorialFiveAssertFalseTest() {
		long factFive = Factorial.factorial(5);
		assertNotEquals(121, factFive);
	}

	@ParameterizedTest
	@DisplayName("Параметризованный тест факториала (только для значения факториала)")
	@ValueSource(ints = {1, 2, 6, 24, 120})
	public void isFactorial_ParameterizedTest(int number){
		assertTrue(number > 0);

		long i = 1, fact = Factorial.factorial((int) i);
		while(fact < number){
			i++;
			fact = Factorial.factorial((int) i);
		}

		Assertions.assertEquals(fact, number);
	}
}
