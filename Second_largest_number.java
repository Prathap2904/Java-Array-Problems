package Array_problemsolving;

public class Second_largest_number {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int temp = 0;
		int total = a.length;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sec = a[total - 2];
		
		System.out.println("The second largest number in an array is : "+sec);

	}

}
