
/*
 * 
 * Binary Search works only on sorted array either in ascending or descending order.
 * Binary Search Time Complexity : O(log n).
 * 
 */

public class Binary_Search {

	public static int fn_binary_search (int arr[],int input,int min, int max) {
		while(min<=max) {
			int mid = (min+max)/2;
			if(arr[mid]==input) {
				return mid;
			} else if(arr[mid]>input) {
				max = mid-1;
				fn_binary_search(arr, input, min, max);
			} else {
				min = mid+1;
				fn_binary_search(arr, input, min, max);
			}
		}
		return -1;
	}
	 
	public static void main(String[] args) {
		int[] even_arr = {1,2,4,5,7,8,9,12};		
		int[] odd_arr = {2,4,5,7,8,9,12};

		System.out.println("In Even array Location for 4 is : "+fn_binary_search(even_arr, 4,0,even_arr.length-1));
		System.out.println("In Odd array Location for 4 is : "+fn_binary_search(odd_arr, 4,0,odd_arr.length-1));
		
		System.out.println("In Even array Location for 1 is : "+fn_binary_search(even_arr, 1,0,even_arr.length-1));
		System.out.println("In Odd array Location for 2 is : "+fn_binary_search(odd_arr, 2,0,odd_arr.length-1));
		
		System.out.println("In Even array Location for 12 is : "+fn_binary_search(even_arr, 12,0,even_arr.length-1));
		System.out.println("In Odd array Location for 12 is : "+fn_binary_search(odd_arr, 12,0,odd_arr.length-1));
		
		System.out.println("In Even array Location for 20 is : "+fn_binary_search(even_arr, 20,0,even_arr.length-1));
		System.out.println("In Odd array Location for 20 is : "+fn_binary_search(odd_arr, 20,0,odd_arr.length-1));	
	}
}

/*
 * Output ::
 * 
 * In Even array Location for 4 is : 2 
 * In Odd array Location for 4 is : 1 
 * In Even array Location for 1 is : 0 
 * In Odd array Location for 2 is : 0 
 * In Even array Location for 12 is : 7 
 * In Odd array Location for 12 is : 6 
 * In Even array Location for 20 is : -1 
 * In Odd array Location for 20 is : -1
 * 
 */
