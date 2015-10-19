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

	@Test
	public void factorsOf4() {
		Assert.assertEquals(Arrays.asList(2, 2), factorsOf(4));
	}

	@Test
	public void factorsOf5() {
		Assert.assertEquals(Arrays.asList(5), factorsOf(5));
	}

	@Test
	public void factorsOf6() {
		Assert.assertEquals(Arrays.asList(2, 3), factorsOf(6));
	}

	@Test
	public void factorsOf9() {
		Assert.assertEquals(Arrays.asList(3, 3), factorsOf(9));
	}

	private List<Integer> factorsOf(int number) {
		List<Integer> factors = new ArrayList<>();

		for (int prime = 2; prime <= number; prime++) {
			while (number % prime == 0) {
				factors.add(prime);
				number = number / prime;
			}
		}

		return factors;
	}
}
