package Array_problemsolving;

public class Leftrotate_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int r=3;
		System.out.println("Before Rotation");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<r;i++) {
			int temp = a[0];
			int j=0;
			for( j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
		System.out.println();
		System.out.println("After Rotation");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
