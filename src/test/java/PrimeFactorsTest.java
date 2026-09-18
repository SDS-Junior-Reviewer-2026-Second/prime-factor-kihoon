import org.example.PrimeFactors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

	private PrimeFactors primeFactors;

	@BeforeEach
	void setUp() {
		primeFactors = new PrimeFactors();
	}

	@Test
	public void testPrimeFactorOf1() {

		assertEquals(Arrays.asList(), primeFactors.of(1));
	}

	@Test
	public void testPrimeFactorOf2(){
		assertEquals(Arrays.asList(2), primeFactors.of(2));
	}

	@Test
	public void testPrimeFactorOf3(){
		assertEquals(Arrays.asList(3), primeFactors.of(3));
	}

	@Test
	public void testPrimeFactorOf4(){
		assertEquals(Arrays.asList(2, 2), primeFactors.of(4));
	}

	@Test
	public void testPrimeFactorOf6(){
		assertEquals(Arrays.asList(2, 3), primeFactors.of(6));
	}

	@Test
	public void testPrimeFactorOf9(){
		assertEquals(Arrays.asList(3, 3), primeFactors.of(9));
	}

	@Test
	public void testPrimeFactorOf12(){
		assertEquals(Arrays.asList(2, 2, 3), primeFactors.of(12));
	}
}
