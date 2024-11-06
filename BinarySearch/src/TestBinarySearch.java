import java.util.Scanner;
import java.util.stream.Stream;

public class TestBinarySearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] arr = { 1,2,3,4,5,6,7,8,9,10};
		
		String ans = null;
		do {
			System.out.println("enter the number");
			int num = sc.nextInt();
			int pos = binarySearch(arr, 0, arr.length-1, num);
			if (pos != -1) {
				System.out.println("Found the element" + pos);
			} else {
				System.out.println("Not Found the Element");
			}
			System.out.println("do you want to continue(y/n)?");
			ans = sc.next();
		} while (ans.equals("y"));

	}

	private static int binarySearch(Integer[] arr, int low, int high, int num) {
		int l = low;
		int h = high;

		if (l <= h) {
			int mid = (l + h) / 2;

			if (arr[mid] == num) {
				return mid;
			} else if (num < arr[mid]) {
				return binarySearch(arr, l, mid - 1, num);
			} else {
				return binarySearch(arr, mid + 1, h, num);

			}
		}
		return -1;
	}

}
