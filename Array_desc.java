package Array_problemsolving;

public class Array_desc {

	public static void main(String[] args) {
		int arr[] = {2,5,8,1,9};
		
		System.out.println("The Original Array :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("The descending order array:");
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			System.out.print(arr[i]+" ");
		}

	}

}
