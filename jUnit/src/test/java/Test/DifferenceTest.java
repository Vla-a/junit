package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.homework.homework7.Task3.Calculatorr;

@RunWith(value = Parameterized.class)
public class DifferenceTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public DifferenceTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:differenceOf({0}-{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 0 }, { -2, 6, -8 }, { 18, 0, 18 },

		});
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculatorr().getDifference(valueA, valueB));
	}

}
