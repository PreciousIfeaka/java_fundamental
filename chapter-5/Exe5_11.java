import java.util.Scanner;

public class Exe5_11 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program gives the sum of extreme values from an input list");
    System.out.println("*****************\n");

    Scanner input = new Scanner(System.in);

    System.out.println("How many integers are you going to input: ");
    int length = input.nextInt();

    System.out.printf("Input %d integers only, one per line\n", length);
    
    int counter = 0;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    while(counter < length) {
      int num = input.nextInt();
      if (num > largest) largest = num;
      if (num < smallest) smallest = num;
      counter++;
    }

    input.close();

    System.out.printf("Largest: %d\n", largest);
    System.out.printf("Smallest: %d\n", smallest);
    System.out.printf("Sum: %d\n", smallest + largest);
  }
}