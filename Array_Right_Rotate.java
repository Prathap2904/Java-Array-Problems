package Array_problemsolving;

public class Array_Right_Rotate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		System.out.println("The Original Array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
		
		int r=3;
		
		
		
		for(int i=0;i<r;i++) {
			int j;
			int last = arr.length-1;
			
			for(j=arr.length-1;j>0;j--) {
				arr[j] =arr[j-1]; 
			}
			arr[0] = last;
		}
		System.out.println(" ");
		
		System.out.println("The Rotate Array is :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
