import java.util.Scanner;

public class Exe5_17 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program calculates the compound interest given the required parameters as inputs");
    System.out.println("*****************\n");

    double principal = 0;
    int years = 0;
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the principal(number only): ");
      principal = input.nextDouble();

      System.out.print("Enter the number of years (number only): ");
      years = input.nextInt();
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format");
    }

    int i = 5;
    while (i < 11) {
      double total = principal * Math.pow((1 + (i * 0.01)), years);
      double interest = total - principal;
      System.out.printf("Compound interest at %d percent is %.2f\n", i, interest);
      i++;
    }
  }
}
