/* binary search if an array is already sorted
1. set a start pointer and an end pointer
2. while start is <= end
3. set midpoint
4. if the midpoint is the key value return 
5. if key looking for is less than mid value then cut off the high to value to search only first half of array
*/
// time complexity is O(log(n)) since only a comparison and do not have to go through each element
public class BinarySearch {
  // array is coming in as sorted
  public int binarySearch(int[] nums, int key) {
    int start = 0
    int end = nums.length - 1
    while(start <= end) {
      // get the middle index in array
      int mid = (start + end) / 2
      if(nums[mid] == key) {
        return mid
      }
      if (nums[mid] > key) {
        // key is to the left of the mid point so set the end to be one less than the midpoint since current midpoint is larger 
        end = mid - 1 
      }
      else {
        start = mid + 1
      }
    }
    return - 1
  }
  
  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
		int[] nums = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		System.out.println(bs.binarySearch(nums, 65));
	}
}