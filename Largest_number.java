package Array_problemsolving;

public class Largest_number {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The Largest Number in array is : "+max);

	}

}
