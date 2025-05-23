import java.util.Scanner;

public class Exe4_20 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program calculates a citizen's tax");
    System.out.println("*****************\n");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the yearly salaries of three citizens: ");

    double sum = 0;

    int i = 0;
    while(i < 3) {
      String line = input.nextLine().trim();
      try {
        double salary = Double.parseDouble(line);
        sum += salary;
        i++;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number");
      }
    }

    input.close();

    double tax = sum > 30000 ? (30000 * 0.15) + ((sum - 30000) * 0.2) : (30000 * 0.15);
  
    System.out.printf("Total salary: $%.2f\n", sum);
    System.out.printf("Salary: $%.2f\n", tax);
  }
}