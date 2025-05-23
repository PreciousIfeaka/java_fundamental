import java.util.Scanner;

public class Exe4_19 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program calculates a sales person's salary plus commision");
    System.out.println("*****************\n");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the sales amount made per item (enter \"end\" when done):");

    double sum = 0;

    while(input.hasNext()) {
      String line = input.nextLine().trim();

      if (line.equalsIgnoreCase("end")) break;
      
      try {
        double sales = Double.parseDouble(line);
        sum += sales;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a number or 'end' to finish.");
      }
    }

    input.close();

    double salary = 200 + (0.09 * sum);
  
    System.out.printf("Total sales: $%.2f\n", sum);
    System.out.printf("Salary: $%.2f\n", salary);
  }
}