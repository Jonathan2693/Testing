package pruebasunitaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calc = new Calculator();

	@Test
	void addition() {
		assertEquals(8, calc.addNumbers(5,3));
	}
	@Test
	void substract() {
		assertEquals(2, calc.subtractNumbers(5,3));
	}

	@Test
	void multiply() {
		assertEquals(15, calc.multiplyNumbers(5,3));
	}

	@Test
	void divide() {
		assertEquals(2, calc.divideNumbers(10,5));
	}


}
