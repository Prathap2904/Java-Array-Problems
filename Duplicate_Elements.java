package Array_problemsolving;

public class Duplicate_Elements {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,30,30,40,50,50};  
		int visited = -1;
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(arr[i]!= -1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						arr[j] = visited;
					}
				}
				System.out.println(arr[i]);
			}
			
		}
		
	
		
	}

}
