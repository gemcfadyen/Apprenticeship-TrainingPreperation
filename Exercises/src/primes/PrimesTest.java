package primes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class PrimesTest {

	@Test
	public void factorsOf1() {
		Assert.assertEquals(Arrays.asList(), factorsOf(1));
	}

	
	@Test
	public void factorsOf2() {
		Assert.assertEquals(Arrays.asList(2), factorsOf(2));
	}

	@Test
	public void factorsOf3() {
		Assert.assertEquals(Arrays.asList(3), factorsOf(3));
	}
	
	private List<Integer> factorsOf(int number) {
		List<Integer> factors = new ArrayList<>();
		if(number % 2 == 0) {
			factors.add(2);
		}
		
		if(number % 3 == 0) {
			factors.add(3);
		}
		
		return factors;
	}
}
