package Array_problemsolving;

public class Sum_of_elements_array {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,12,43,5};
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("The sum of Element in an Array : "+sum);

	}

}
