package sort;
/*
 * 
 * 선택정렬 (Selection Sort)
 * 
 */
public class SelectionSort {	
	public static void main(String[] args) {
		int[] arr = {15, 11, 1, 3, 7};
		int tmp = 0;
		int min = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
