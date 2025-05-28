import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String cardType;
    String cardNumber;
    int cardNumberLength;
    String cardValidity;

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter your card number: ");
      String number = input.nextLine();

      String cardNumberStr = number.replaceAll("\\s+", "");

      Validate cardValidator = new Validate(cardNumberStr);

      cardType = cardValidator.getCardType();
      cardNumber = cardValidator.getCardNumber();
      cardNumberLength = cardValidator.getCardNumber().length();
      cardValidity = cardValidator.getCardValidity();
    }

    System.out.println("******************************");
    System.out.println("***Credit Card Type: " + cardType);
    System.out.println("***Credit Card Number: " + cardNumber);
    System.out.println("***Credit Card Digit Length: " + cardNumberLength);
    System.out.println("***Credit Card Validity Status: " + cardValidity);
    System.out.println("******************************");
  }
}