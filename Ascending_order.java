package Array_problemsolving;

public class Ascending_order {

	public static void main(String[] args) {
		int arr[] = {2,5,8,1,9};
		
		System.out.println("The original Array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");

	}

}
