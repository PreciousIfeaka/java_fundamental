import java.util.Scanner;

public class Exe2_25 {
  public static void main(String args[]) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("*****************");
      System.out.println("This program checks if an input integer is divisible by 3");
      System.out.println("*****************");

      System.out.print("\nEnter the integer: ");
      int num1 = input.nextInt();

      System.out.println(num1 % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
    }
  }
}