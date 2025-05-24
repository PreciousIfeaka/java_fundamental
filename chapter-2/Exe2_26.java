import java.util.Scanner;

public class Exe2_26 {
  public static void main(String args[]) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("*****************");
      System.out.println("This program compares two input ints and checks in 3x the first is a multiple of 2x the second");
      System.out.println("*****************");

      System.out.print("\nEnter the first integer: ");
      int num1 = input.nextInt();

      System.out.print("\nEnter the second integer: ");
      int num2 = input.nextInt();

      System.out.println((num1 * 3) % (num2 * 2) == 0 ? "Valid multiple" : "Invalid multiple");
    }
  }
}