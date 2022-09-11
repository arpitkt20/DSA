
/*
 * 
 * Asked in Google, Amazon, Microsoft
 * Find First and Last position of the given element in a given sorted array
 * (Solved using binary search)
 * example - 
 * 		input - [0,5,5,6,6,6], X -> 3
 * 		output - -1, -1 
 * 
 * 		input - [0,0,1,1,2,2,2,2] X -> 2
 * 		output - 4, 7
 */

public class Binary_Search_FirstAndLast {

	public static int first_occurence(int arr[], int input, int min, int max) {
		int position=-1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (arr[mid] == input) {
				position = mid;
				max= mid-1;
			} else if (arr[mid] > input) {
				max= mid-1;
				first_occurence(arr,input,min,max);
			} else {
				min = mid+1;
				first_occurence(arr,input,min,max);
			}
		}
		return position;
	}
	
	public static int last_occurence(int arr[], int input, int min, int max) {

		int position=-1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (arr[mid] == input) {
				position = mid;
				min= mid+1;
			} else if (arr[mid] > input) {
				max=mid-1;
				last_occurence(arr,input,min,max);
			} else {
				min=mid+1;
				last_occurence(arr,input,min,max);
			}
		}
		return position;
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 5, 5, 6, 6, 6 };
		int[] arr2 = { 0, 0, 1, 1, 2, 2, 2, 2 };
		int[] arr3 = { 1 };
	
		System.out.println("In {0,5,5,6,6,6} array Location for 3 is : " + first_occurence(arr1, 3, 0, arr1.length - 1)+","+last_occurence(arr1, 3, 0, arr1.length-1));
		System.out.println("In {0,0,1,1,2,2,2,2} array Location for 2 is : " + first_occurence(arr2, 2, 0, arr2.length - 1)+","+last_occurence(arr2, 2, 0, arr2.length-1));
		System.out.println("In {1} array Location for 1 is : " + first_occurence(arr3, 1, 0, arr3.length - 1)+","+last_occurence(arr3, 1, 0, arr3.length-1));
	}
}
