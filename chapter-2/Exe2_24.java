import java.util.Scanner;

public class Exe2_24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    System.out.println(
      "This Program determines the max integer from a group of 5 input integers"
      );

    System.out.print("Enter your first integer: ");
    int number1 = input.nextInt();
    max = getMax(max, number1);
    min = getMin(min, number1);

    System.out.print("Enter your second integer: ");
    int number2 = input.nextInt();
    max = getMax(max, number2);
    min = getMin(min, number2);

    System.out.print("Enter your third integer: ");
    int number3 = input.nextInt();
    max = getMax(max, number3);
    min = getMin(min, number3);

    System.out.print("Enter your fourth integer: ");
    int number4 = input.nextInt();
    max = getMax(max, number4);
    min = getMin(min, number4);

    System.out.print("Enter your fifth integer: ");
    int number5 = input.nextInt();
    max = getMax(max, number5);
    min = getMin(min, number5);

    System.out.println("Largest: " + max);
    System.out.println("Smallest: " + min);
  }

  public static int getMax(int a, int b) {
    return a > b ? a : b;
  }

  public static int getMin(int a, int b) {
    return a < b ? a : b;
  }
}