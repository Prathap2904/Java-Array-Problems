package Array_problemsolving;

import java.util.Scanner;

public class Largest_element_array {

	public static void main(String[] args) {
		int arr[]= new int[6];
		
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
			if(arr[j]>max) {
				max = arr[j];
		
		
}
		
	}
		System.out.println("The maximum of array is: "+max);


}
}
