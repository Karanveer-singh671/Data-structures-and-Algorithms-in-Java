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

  public static void main(String[], args) {
    int[] arr = {5,9,12,4,5}
    MinArray ma = new MinArray();
    ma.findMin(arr)
  }
}