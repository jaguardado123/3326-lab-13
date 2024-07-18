import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	static int[] arr1 = {2, 5, 7, 8, 10};
	static int[] arr2 = {77, 52, 112, 45, 63};
	static int[] arr3 = {115, 147, 203, 159, 302, 245, 401}; 
	
	@Test
	public void testing_sum_with_array1() {
		SimpleMath test = new SimpleMath();
		assertEquals(32, test.sum(arr1, 5));
	}

	@Test
	public void testing_sum_with_array2() {
		SimpleMath test = new SimpleMath();
		assertEquals(349, test.sum(arr2, 5));
	}

	@Test
	public void testing_sum_with_array3() {
		SimpleMath test = new SimpleMath();
		assertEquals(1572, test.sum(arr3, 7));
	}

	@Test
	public void testing_max_with_array1() {
		SimpleMath test = new SimpleMath();
		assertEquals(10, test.max(arr1, 5));
	}

	@Test
	public void testing_max_with_array2() {
		SimpleMath test = new SimpleMath();
		assertEquals(112, test.max(arr2, 5));
	}

	@Test
	public void testing_max_with_array3() {
		SimpleMath test = new SimpleMath();
		assertEquals(401, test.max(arr3, 7));
	}
}