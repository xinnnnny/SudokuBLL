package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean hasDuplicates(int[] arr)
	{
		int[] arrCopy = Arrays.copyOf(arr, arr.length); 

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arrCopy[i] == arrCopy[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;
		
		if (arr == null)
			return false;
		
		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}

		return doesElementExist;
	}
	public static boolean hasAllValues (int[] arr1, int[] arr2) {
		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) {

		boolean bFound = false;

		for (int i = 0; i < arr1.length; i++) {
		if (arr1[i] == arr2[j]) {
		bFound = true;
		break;
		}
		
		}
		if (bFound == false) {
		hasAllValues = false;
		break;
		}
		}
		
		return hasAllValues;
	}
	int arr[];
	private int[] getColumn (int[] iCol) {
		for (int i=0; i<LatinSquare.length; i++) {
			return arr [i];
		}
	}
	private int[] getRow (int[] iRow) {
		for (int i=0; i<LatinSquare.length; i++) {
			return arr [i];
		}
	}
	private boolean containsZero () {
		for (int i=0; i< LatinSquare.length; i++) {
			for (int j=0; j<LatinSquare.length; j++) {
				if (LatinSquare[i][j]== 0) {
					return true;
				}
			}
		}
	}
}

	
	
