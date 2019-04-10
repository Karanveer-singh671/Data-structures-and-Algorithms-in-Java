new import java.util.HashMap;
import java.lang.IllegalArgumentException;
import java.lang.System;
public class TwoSum {
  // return an array of the indices that add up to the target (two numbers)
  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    // store integers as key value pairs
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < numbers.length; i++) {
      if(!map.containsKey(target - numbers[i])) {
        map.put(numbers[i], i)
      } else {
        result[1] = i; // store the index where the number adding to target is found
        result[0] = map.get(target - numbers[i]) // target - value at i will give the compliment then it will check the keys for that number and return the value assoicated with that number in this case it will return the indice of that number since we stored that as values
        return result
      }
    }
    throw new IllegalArgumentException("2 numbers adding to target not found")
  }

  public static void main(String[], args) {
    int[] numbers = {3,4,7,8,9}
    int[] result = twoSum(numbers, 10)
    System.out.println("The two indices are - " + result[0] + 
                                   " and " + result[1]);
  }
}