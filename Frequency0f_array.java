package Array_problemsolving;

public class Frequency0f_array {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 8, 3, 2, 2, 2,5,1};
		
		int fr[] = new int[arr1.length];
		int visited = -1;
		
		for(int i=0;i<arr1.length;i++) {
			int count =1;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]==1) {
				System.out.println(arr1[i]+" "+"occurs "+"times"+fr[i]);
			}
		}

	}

}
