package sort;

public class SelectionSort {	
	public static void main(String[] args) {
		int[] arr = { 15, 11, 1, 3, 7};
		int tmp = 0;
		int min = 0;
		
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (min > arr[j+1]) {
					min = arr[j+1];
					tmp = j+1;
				}
			}
			arr[tmp] = arr[i];
			arr[i] = min;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
