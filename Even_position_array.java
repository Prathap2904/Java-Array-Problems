package Array_problemsolving;

public class Even_position_array {

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7};
		
		System.out.println("Even position array");
		
		for(int i=1;i<n.length;i=i+2) {
				System.out.print(n[i]+" ");
			
		}

	}

}
