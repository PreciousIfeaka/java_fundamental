import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the customer's name?");
    String customerName = input.nextLine();

    Customer customer = new Customer(customerName);

    List<Product> products = new ArrayList<Product>();

    while (true) {
      System.out.println("What did the user buy?");
      String productName = input.nextLine();

      System.out.println("How many pieces?");
      int quantity = input.nextInt();
      input.nextLine();

      System.out.println("How much per unit?");
      double price = input.nextDouble();
      input.nextLine();

      Product product = new Product(productName, price, quantity);
      products.add(product);

      System.out.println("Add more items (yes/no)?");
      String answer = input.nextLine();

      if (answer.equalsIgnoreCase("no")) break;
      else if (!answer.equalsIgnoreCase("yes")) throw new InputMismatchException("Invalid Input, enter yes or no.");
    }

    System.out.println("What is your name?");
    String cashierName = input.nextLine();

    System.out.println("How much discount will he get?");
    double discount = input.nextDouble();

    Invoice invoice = new Invoice(products, customer, discount, cashierName);
    invoice.setSubtotal();
    invoice.setBillTotal();

    LocalDateTime datetime = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm:ss a");
    String formattedDatetime = datetime.format(format);

    /**
     * Invoice Section
     */

    System.out.print("\nSEMICOLON STORES\nMAIN BRANCH\n");
    System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
    System.out.println("TEL: 03293828343");
    System.out.println("Date: " + formattedDatetime);
    System.out.println("Cashier: " + invoice.getCashierName());
    System.out.println("Customer Name: " + customer.getName());

    System.out.println("====================================================================");
    System.out.println("      ITEM          QTY          PRICE          TOTAL(NGN)");
    System.out.println("--------------------------------------------------------------------");
    
    Iterator<Product> productsIterator = products.iterator();
    
    while (productsIterator.hasNext()) {
      Product product = productsIterator.next();
      System.out.println("\t" + product.getName() + "\t" + product.getQuantity() + "\t" + product.getPrice() + "\t" + product.getAmount());
    }

    System.out.println("\n");
    System.out.println("--------------------------------------------------------------------");
    System.out.println("\t   Sub Total:\t" + invoice.getSubtotal());
    System.out.println("\t    Discount:\t" + (invoice.getDiscount() * invoice.getSubtotal()) / 100);
    System.out.println("\tVAT @ 17.50%:\t" + 0.175 * invoice.getSubtotal());
    System.out.println("====================================================================");
    System.out.println("\t  Bill Total:\t" + invoice.getBillTotal());
    System.out.println("====================================================================");
    System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " + invoice.getBillTotal());
    System.out.println("====================================================================\n");


    System.out.println("\nHow much did the customer give you?");
    double amount = input.nextDouble();
    input.close();


    /**
     * Receipt Section
     */

    System.out.print("\nSEMICOLON STORES\nMAIN BRANCH\n");
    System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
    System.out.println("TEL: 03293828343");
    System.out.println("Date: " + formattedDatetime);
    System.out.println("Cashier: " + invoice.getCashierName());
    System.out.println("Customer Name: " + customer.getName());

    System.out.println("====================================================================");
    System.out.println("      ITEM          QTY          PRICE          TOTAL(NGN)");
    System.out.println("--------------------------------------------------------------------");
    
    Iterator<Product> productsIterator1 = products.iterator();
    
    while (productsIterator1.hasNext()) {
      Product product = productsIterator1.next();
      System.out.println(  product.getName() + "\t" + product.getQuantity() + "\t" + product.getPrice() + "\t" + product.getAmount());
    }

    System.out.println("\n");
    System.out.println("--------------------------------------------------------------------");
    System.out.println("\t   Sub Total:\t" + invoice.getSubtotal());
    System.out.println("\t    Discount:\t" + invoice.getDiscount() * invoice.getSubtotal());
    System.out.println("\tVAT @ 17.50%:\t" + 0.175 * invoice.getSubtotal());
    System.out.println("====================================================================");
    System.out.println("\t  Bill Total:\t" + invoice.getBillTotal());
    System.out.println("\t Amount Paid:\t" + amount);
    System.out.println("\t     Balance:\t" + (amount - invoice.getBillTotal()));
    System.out.println("====================================================================");
    System.out.println("\t\tTHANKS FOR YOUR PATRONAGE");
    System.out.println("====================================================================\n");
  }
}