
/*
 * 
 * Find the total number of occurrence for a number in a give sorted array.
 * Logic_1 -> Do linear search.
 *
 * Logic_2 -> Use Binary Search.
 * 			find the first occurrence
 * 			find the last occurrence.
 * 			Total_Occ = (Last_Occ - First_Occ) + 1
 * 
 */

public class Binary_Search_Total_No_Of_Occurrence {

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
	
	public static int total_occurrence(int arr[], int num, int min, int max) {
		int first_occurrence = first_occurence(arr, num, 0, arr.length - 1);
		int last_occurrence = last_occurence(arr, num, 0, arr.length - 1);
		int total_occ= 0;
		if(last_occurrence >=0 && first_occurrence >=0) {
			total_occ = (last_occurrence-first_occurrence) +1;
		}
		return total_occ;
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 5, 5, 6, 6, 6 };
		int[] arr2 = { 0, 0, 1, 1, 2, 2, 2, 2 };
		int[] arr3 = { 1 };
		int num = 3;

		System.out.println("In {0,5,5,6,6,6} array total occurrence of 3 is : " + total_occurrence(arr1, num, 0, arr1.length - 1));
		num = 2;
		System.out.println("In {0,0,1,1,2,2,2,2} array total occurrence of 2 is : " + total_occurrence(arr2, num, 0, arr2.length - 1));
		num = 1;
		System.out.println("In {1} array total occurrence of 1 is : " + total_occurrence(arr3, num, 0, arr3.length - 1));
	}
}
