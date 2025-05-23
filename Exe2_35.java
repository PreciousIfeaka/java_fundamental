import java.util.Scanner;

public class Exe2_35 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("*****************");
    System.out.println("This program calculates a user's BMI based on given input");
    System.out.println("*****************");

    System.out.print("Enter your desired unit of measurment (British/American): ");
    String system = input.nextLine();

    System.out.print("Enter your body mass: ");
    int mass = input.nextInt();

    System.out.print("Enter your height: ");
    int height = input.nextInt();

    
    System.out.println("Your BMI is: " + bmiCalc(system, mass, height));

    System.out.println("\n****************\nBMI Categories:\n");

    System.out.println("Underweight = <18.5\nNormal weight = 18.5-24.9\nOverweight = 25-29.9\nObesity = BMI of 30 or greater");
  }

  private static int bmiCalc(String system, int weight, int height) {
    int bmi = weight / ( height * height );
    
    if ("American".equals(system)) return bmi * 703;
    else if ("British".equals(system)) return bmi;
    else throw new RuntimeException("Enter a valid system of measurment");
  }
}