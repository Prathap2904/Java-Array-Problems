package Array_problemsolving;


public class Array_copy {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		int copy[] = new int[a.length];
		System.out.println("Copy array is :");
		for(int i=0;i<a.length;i++) {
			copy[i]=a[i];
			System.out.print(copy[i]+" ");
		}

	}

}
