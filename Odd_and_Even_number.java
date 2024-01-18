package Array_problemsolving;

public class Odd_and_Even_number {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println("Even Number : "+a[i]);
			}
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.println("oddNumber : "+a[i]);
			}
			
		}
	}

}
