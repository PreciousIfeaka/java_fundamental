import java.util.Scanner;


public class Exe5_14 {
  public static void main(String[] args) {
    System.out.println("*****************");
    System.out.println("This program calculates student's grades.");
    System.out.println("*****************\n");

    int a = 0; int b = 0; int c = 0; int d = 0;

    System.out.println("Enter the grade of 5 students, only A to D allowed");

    try (Scanner input = new Scanner(System.in)) {
      int i = 1;

      while (i < 6) {
        switch (input.nextLine()) {
          case "A" -> a++;
          case "B" -> b++;
          case "C" -> c++;
          case "D" -> d++;
          default -> throw new RuntimeException("Invalid grade");
        }
        i++;
      }
    }

    System.out.println("******************************");
    System.out.printf("Grade A: %d students\nGrade B: %d students\nGrade C: %d students\nGrade D: %d students\n", a, b, c, d);
  }
}