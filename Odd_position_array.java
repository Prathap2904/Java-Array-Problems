package Array_problemsolving;

public class Odd_position_array {

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5,6,7,8};
		
		System.out.println("odd position");
		
		for(int i=0;i<n.length;i=i+2) {
			System.out.print(n[i]);
		}

	}

}
