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

	
	private List<Integer> factorsOf(int number) {
		List<Integer> factors = new ArrayList<>();
		if(number >= 2) {
			factors.add(2);
		}
		
		return factors;
	}
}
