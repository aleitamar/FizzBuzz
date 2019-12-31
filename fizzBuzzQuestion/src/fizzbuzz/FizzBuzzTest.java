package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {	
	private FizzBuzz fizzBuzz;

	@Before
	public void setup() throws Exception {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void fizzBuzzOf1_is1() throws Exception {
		String result = fizzBuzz.of(1);
		assertTrue(result.equals("1"));
	}


	@Test
	public void fizzBuzzOf2_is2() throws Exception {
		String result = fizzBuzz.of(2);
		assertTrue(result.equals("2"));
	}
	

	@Test
	public void fizzBuzzOf3_isFizz() throws Exception {
		String result = fizzBuzz.of(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void fizzBuzzOf6_isFizz() throws Exception {
		String result = fizzBuzz.of(6);
		assertEquals("Fizz", result);
	}
	
	
	@Test
	public void fizzBuzzOf5_isBuzz() throws Exception {
		String result = fizzBuzz.of(5);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void fizzBuzzOf15_isFizzBuzz() throws Exception {
		String result = fizzBuzz.of(15);
		assertEquals("FizzBuzz", result);
	}
}
