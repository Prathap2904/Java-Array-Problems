package Array_problemsolving;

public class Smallest_number {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
