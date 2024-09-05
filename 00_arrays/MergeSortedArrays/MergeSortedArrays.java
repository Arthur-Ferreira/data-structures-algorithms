package MergeSortedArrays;

/* Master the Coding Interview: Data Structures + Algorithms
 *
 *   Programa: Mesclar Arrays Ordenados
 *   Objetivo:
 *
 *   Autor: Arthur Ferreira
 */

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

  public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2){
    List<Integer> mergedArray = new ArrayList<>();
    int i = 0, j = 0;

    if(arr1.length == 0) {
      for(int num : arr2) {
        mergedArray.add(num);
      }
    }
    if(arr2.length == 0) {
      for(int num : arr1) {
        mergedArray.add(num);
      }
    }

    while(i < arr1.length || j < arr2.length) {
      if (j >= arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
        mergedArray.add(arr1[i]);
        i++;
      } else {
        mergedArray.add(arr2[j]);
        j++;
      }
    }

    return mergedArray;
  }
}
