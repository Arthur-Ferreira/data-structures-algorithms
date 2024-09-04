package StringsAndArray;

/* Master the Coding Interview: Data Structures + Algorithms
*
*   Programa: Revertendo uma String
*   Objetivo: Reverter o Array informado no local.
*
*   Autor: Arthur Ferreira
*/

public class ReverseAString {

  public String reverseAString(String args) {

    char[] charArray = args.toCharArray();
    int start = 0, end = charArray.length - 1;
    char[] reversedStrings = new char[charArray.length];
    
    for(int i = end; i >= 0; i--) {
      reversedStrings[start] = charArray[i];
      start++;
    }

    return new String(reversedStrings);
  }
}
