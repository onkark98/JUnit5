package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	private MathUtils mathUtils;

	@BeforeAll
	static void intiBeforeAll()
	{
		System.out.println("Running before all!");
	}

	@AfterEach
	void initTearDownEach()
	{
		System.out.println("Cleaning up!");
	}

	@BeforeEach
	void init()
	{
		mathUtils = new MathUtils();
	}

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual);	
	}
	
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
	@Test
	void testComputeCircleRadius()
	{
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}
	

}
