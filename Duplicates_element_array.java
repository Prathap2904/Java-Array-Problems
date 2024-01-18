package Array_problemsolving;

public class Duplicates_element_array {

	public static void main(String[] args) {
		int n[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		System.out.println("Array duplicates element");
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i]);
				}
			}
		}

	}

}
