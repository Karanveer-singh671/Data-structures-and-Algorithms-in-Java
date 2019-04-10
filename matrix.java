/* given a row and column wise (nxn) sorted matrix.
Write a program to search a key in a given matrix */
public class SortedMatrix {

  public void search(int[][] matrix, int n, int x) {
    // 4 by 4 matrix so value of n will be 4
    int i = 0
    int j = n - 1
    while(i < n && j >=0) {
      if(matrix[i][j] == x) {
        System.out.print(x + " is found at" + i + j)
        return
      }
      if(matrix[i][j] > x) {
        j--
      } else {
        i++
      }
    }
    System.out.print("value not found")
  }

  public static void main(String[], args) {
    int[][] matrix = {
      {10,20,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,51}
    }
  }

  SortedMatrix sm = new SortedMatrix()
  sm.search(matrix, matrix.length, 32)
}
