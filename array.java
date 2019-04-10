import java.lang.IllegalArgumentException;
public class MinArray {

  public int findMin(int[] arr) {
    if(arr == null || arr.length == 0) {
      throw new IllegalArgumentException("need to have valid array")
    }
    int minimum = arr[0];
    for (int i; i < arr.length; i++) {
      if(minimum > arr[i]) {
        minimum = arr[i]
      }
    }
    return minimum
  }
  // do not return and just keep inplace
  public static void reverseArray(int[] numbers, int start, int end) {
    // int start = 0
    // int end = numbers.length - 1
    while(start < end) {
      int temp = numbers[start];
      numbers[start] = numbers[end]
      numbers[end] = temp
      start++
      end--
    }
  }

  public static void main(String[], args) {
    int[] arr = {5,9,12,4,5}
    MinArray ma = new MinArray();
    ma.findMin(arr)
  }
}