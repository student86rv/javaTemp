
import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		Random random = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
}