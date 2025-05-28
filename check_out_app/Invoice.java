import java.util.Iterator;
import java.util.List;

public class Invoice {
  private final List<Product> products;
  private final Customer customer;
  private double subTotal;
  private final double discount;
  private final String cashierName;
  private double billTotal;

  public Invoice(List<Product> products, Customer customer, double discount, String cashierName) {
    this.products = products;
    this.customer = customer;
    this.discount = discount;
    this.cashierName = cashierName;
  }

  public double getDiscount() {
    return discount;
  }

  public String getCashierName() {
    return cashierName;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setSubtotal() {
    double total = 0;
    Iterator<Product> it = products.iterator();

    while (it.hasNext()) {
      total += it.next().getAmount();
    }

    this.subTotal = total;
  }

  public double getSubtotal() {
    return subTotal;
  }

  public void setBillTotal() {
    this.billTotal = subTotal * (1 - ((discount / 100) - 0.175));
  }
  
  public double getBillTotal() {
    return billTotal;
  }
}