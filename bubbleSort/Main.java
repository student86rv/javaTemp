import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}