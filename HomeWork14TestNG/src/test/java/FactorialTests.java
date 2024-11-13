import com.dank0851.Factorial;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.dank0851.Factorial.factorial;
import static org.testng.Assert.*;

public class FactorialTests {
	private int number;

	@BeforeClass
	public void setup() {
		number = 12;
	}

	@AfterClass
	public void tearDown() {
		number = 0;
	}

	@Test(testName = "Простой тест для Before/After")
	public void givenNumber_whenEven_thenTrue() {
		assertTrue(number % 2 == 0);
	}

	@Test(testName = "Tест факториала 5")
	void factorialFiveAssertTrueTest() {
		long factFive = factorial(5);
		assertEquals(120, factFive);
	}

	@Test(testName = "Tест на неверный факториал 5")
	void factorialFiveAssertFalseTest() {
		long factFive = factorial(5);
//        assertNotEquals(120, factFive);
		Assert.assertNotEquals(121, factFive);
	}

	@Test(description = "Проверка на неотрицательность.")
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


	@org.jetbrains.annotations.NotNull
	@org.jetbrains.annotations.Contract(value = " -> new", pure = true)
	@DataProvider(name = "getFactorialDataKeyValue", parallel = true)
	public static Object[][] getFactorialDataKeyValue() {
		return new Object[][] {
				{1, 1},
				{2, 2},
				{3, 6},
				{4, 24},
				{5, 120},
				{18, 6402373705728000L}
		};
	}

	@Test(testName = "Параметризованный тест факториала (для пар показателя и значения факториала)",
			dataProvider = "getFactorialDataKeyValue", threadPoolSize = 5, invocationCount = 2)
	public void isFactorial_Csv_ParameterizedTest(long number, long fact){
		final Thread thread = Thread.currentThread();
		System.out.printf("#%d: %s, %d\n", thread.getId(), thread.getName(), fact);

		assertEquals(fact, factorial(number));
	}

}