import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your card number: ");
    String number = input.nextLine();

    String cardNumberStr = number.replaceAll("\\s+", "");

    Validate cardValidator = new Validate(cardNumberStr);

    System.out.println("******************************");
    System.out.println("***Credit Card Type: " + cardValidator.getCardType());
    System.out.println("***Credit Card Number: " + cardValidator.getCardNumber());
    System.out.println("***Credit Card Digit Length: " + cardValidator.getCardNumber().length());
    System.out.println("***Credit Card Validity Status: " + cardValidator.getCardValidity());
    System.out.println("******************************");
  }
}