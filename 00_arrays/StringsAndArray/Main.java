package StringsAndArray;

public class Main {

  public static void main(String[] args) {
    ReverseAString reverser = new ReverseAString();
    String original = "Hello, World!";
    String reversed = reverser.reverseAString(original);
    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
  }
}
