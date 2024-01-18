package Array_problemsolving;

public class Second_smallest_number {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sec_small = a[1];
		
		System.out.println("The Second Smallest Number is : "+sec_small);
	}

}
