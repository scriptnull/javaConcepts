import java.util.Scanner;


public class ArrayConcept {

	public static void main(String[] args) {
		
		//collection of same type of datatypes is permitted
		//can't change the array size
		//Check ArrayList class for changing the array size accordingly in runtime
		//intializing an array 
		//method 1
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
		
		//method 2
		int b[] = new int[3];
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);			
		}
		
		//method 3 using Array intializer 
		int[] myarr = {1,2,3};
		
		
		//method 1 is usually prferred and advisable to follow
		
		//multidimensional arrays are allowed in java 
		
		int[][] multi = new int [2][2];
		
		//print a multidimensional array
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				System.out.println(multi[i][j]);				
			}
		}
		
		

	}

}
