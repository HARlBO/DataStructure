package sort;
/*
 * 
 * 삽입 정렬 (Insertion Sort)
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {15, 11, 1, 3, 7};
		int tmp = 0;
		
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			int j = i - 1;
			
			while(j >= 0 && tmp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = tmp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
