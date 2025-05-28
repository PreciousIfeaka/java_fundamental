public class Validate {
  private final String cardNumber;

  public Validate(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getCardType() {
    if (cardNumber.startsWith("4")) return "Visa";
    else if (cardNumber.startsWith("5")) return "MasterCard";
    else if (cardNumber.startsWith("37")) return "American Express";
    else if (cardNumber.startsWith("6")) return "Discover";
    else return "Invalid Card";
  }

  public String getCardValidity() {
    if (cardNumber.length() < 13 || cardNumber.length() > 16) return "Invalid";
    int forwardSum = 0;
    int backwardSum = 0;
    for (int i = cardNumber.length() - 1; i >= 0; i--) {
      int digitVal = Character.getNumericValue(cardNumber.charAt(i));
      if ((cardNumber.length() - i) % 2 == 0) {
        forwardSum += (digitVal * 2) < 9 ? (digitVal * 2) : (digitVal * 2) - 9;
      } else {
        backwardSum += digitVal;
      }
    }

    return (backwardSum + forwardSum) % 10 == 0 ? "Valid" : "Invalid";
  }
}
