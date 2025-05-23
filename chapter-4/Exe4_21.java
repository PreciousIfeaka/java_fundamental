import java.util.Scanner;

public class Exe4_21 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program gives the largest number from an input list");
    System.out.println("*****************\n");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter exactly 10 intergers, one per line and press enter when done.");

    
    int counter = 0;
    int largest = Integer.MIN_VALUE;

    while(counter < 10) {
      int num = input.nextInt();
      if (num > largest) largest = num;
      counter++;
    }

    input.close();

    System.out.printf("Largest: %d\n", largest);
  }
}