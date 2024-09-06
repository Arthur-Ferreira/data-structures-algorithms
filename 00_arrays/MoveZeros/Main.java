package MoveZeros;


import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};

    MoveZeros.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
}
