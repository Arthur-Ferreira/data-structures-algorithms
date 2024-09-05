package MergeSortedArrays;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    int[] array1 = {0, 3, 4, 31};
    int[] array2 = {3, 4, 6, 31};

    List<Integer> merge = MergeSortedArrays.mergeSortedArrays(array1, array2);
    System.out.println(merge);
  }
}
