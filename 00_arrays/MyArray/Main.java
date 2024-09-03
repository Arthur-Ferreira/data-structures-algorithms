package MyArray;

public class Main {
  public static void main(String[] args) {
    MyArray newArray = new MyArray();

    newArray.push("Hi");
    newArray.push("you");
    newArray.push("!");

    newArray.pop();

    newArray.delete(1);

    System.out.println(newArray);
  }
}
