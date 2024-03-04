package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

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

	@Nested
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(2, mathUtils.add(1, 1),
					"Add method should return the sum of two numbers");
		}

		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathUtils.add(-1, -1),
					"Add method should return the sum of two numbers");
		}

		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathUtils.add(-1, 1),
					"Add method should return the sum of two numbers");
		}
	}

	@Test
	@DisplayName("Divide Method Test")
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
	@Test
	@DisplayName("Circle Area Method Test")
	void testComputeCircleRadius()
	{
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}

	@Test
	@DisplayName("TDD Method should not run")
	@Disabled
	void testDisable()
	{
		fail("This test should be disable");
	}

}
