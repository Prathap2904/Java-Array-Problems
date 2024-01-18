package Array_problemsolving;

import java.util.Scanner;

public class Smallest_element_array {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min =arr[0];
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			
			if(arr[j]<min) {
				min = arr[j];
			}
		}
		System.out.print("The minimum number is :"+min);
	}

}
