package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 1, 3, 4, 5 };
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		assertEquals(bExpected, bActual);

	}


	
	@Test
	public void doesElementExist_Test1() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 3;

		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
				
		assertEquals(bExpected, bActual);
	}
		
	@Test
	public void doesElementExist_Test2() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 8;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
				
		assertEquals(bExpected, bActual);
	}

	@Test
	public void doesElementExist_Test3() {

		int[] arr = null;
		int iValue = 1;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
				
		assertEquals(bExpected, bActual);

	}
}
