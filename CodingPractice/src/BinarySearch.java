import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		long arr[] = {4,5,6,8,9};
		//long key = 7;
		System.out.println(indexOfSearchValue(arr, 6));
		System.out.println(indexOfSearchValue(arr, 7));
		System.out.println(indexOfSearchValue(arr, 3));
		System.out.println(indexOfSearchValue(arr, 12));
		Arrays.binarySearch(arr, 6);
		Arrays.binarySearch(arr, 7);
	}

	static int indexOfSearchValue(long[] sortedArray, long searchValue)
	{
		int begin = 0, end = sortedArray.length - 1, mid = 0;
		
		if(searchValue < sortedArray[begin])
			return 0;
		else if(searchValue > sortedArray[end])
			return end + 1;
		
		while(begin <= end) {
			mid = begin + (end - begin) / 2;
			if(sortedArray[mid] == searchValue)
				return mid;
			else if (sortedArray[mid] > searchValue)
				end = mid -1;
			else if (sortedArray[mid] < searchValue)
				begin = mid + 1;
		}
		
		return mid;  
	}
	
}
