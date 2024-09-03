package MyArray;

/* Master the Coding Interview: Data Structures + Algorithms
*
*   Programa: Criando Meu Proprio Array
*   Objetivo: 
*
*   Autor: Arthur Ferreira
*/

import java.util.ArrayList;

public class MyArray {
  private int length;
  private ArrayList<Object> data;

  public MyArray() {
    this.length = 0;
    this.data = new ArrayList<>();
  }

  public Object get(int index) {
    return data.get(index);
  }

  public int push(Object item) {
    data.add(item);
    length++;
    return length;
  }

  public Object pop() {
    Object lastItem = data.get(length - 1);
    data.remove(length - 1);
    length--;
    return lastItem;
  }

  public Object delete(int index) {
    Object item = data.get(index);
    shiftItems(index);
    return item;
  }

  private void shiftItems(int index) {
    for (int i = index; i < length - 1; i++) {
      data.set(i, data.get(i + 1));
    }
    data.remove(length - 1);
    length--;
  }

  @Override
  public String toString() {
    return "MyArray{" +
        "data = " + data +
        ", length = " + length +
        '}';
  }
}