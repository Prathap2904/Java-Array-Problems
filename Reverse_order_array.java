package Array_problemsolving;

public class Reverse_order_array {

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5};
		
		System.out.println("The reverse order is :");
		
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" ");
		}

	}

}
