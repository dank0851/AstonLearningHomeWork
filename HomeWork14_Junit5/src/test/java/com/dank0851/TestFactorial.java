package com.dank0851;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.w3c.dom.ls.LSOutput;

import static com.dank0851.Factorial.factorial;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactorial {
	@Test
	@DisplayName("Tест факториала 5")
	void factorialFiveAssertTrueTest() {
		long factFive = factorial(5);
		assertEquals(120, factFive);
	}

	@Test
	@DisplayName("Tест на факториал 5")
	void factorialFiveAssertFalseTest() {
		long factFive = factorial(5);
		assertNotEquals(121, factFive);
	}

	@Test
	@DisplayName ( "Проверка на неотрицательность.")
	void testFactorialPositive() {
		IllegalArgumentException exception = expectThrows(IllegalArgumentException.class, () -> factorial(-1));
		assertEquals(exception.getMessage(), "Введите целое неотрицательное число.");
	}

	@DataProvider
	public Object[][] data() {
		return new Object[][] {
				{0, 1},
				{1, 1},
				{5, 120}
		};
	}

	@Test(description = "Вычисление значения факториала числа.", dependsOnMethods = {"testFactorialPositive"}, dataProvider = "data")
	public void testFactorialCalculations(Integer a, Integer b) {
		Assert.assertEquals(Main.calculateFactorial(a), b, "Факториал вычеслен неверно");
	}
}
