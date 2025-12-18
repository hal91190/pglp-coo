package fr.uvsq.coo.principles.demeter;

// tag::customer-correct[]
public class Customer {
  private Wallet wallet;

  public Customer(double fortune) {
    wallet = new Wallet(fortune);
  }

  public double getPayment(double amountToPayInEuros) {
    double totalMoney = wallet.getTotalMoney();
    double paidAmount = 0.0;
    if (totalMoney > amountToPayInEuros) {
      paidAmount = amountToPayInEuros;
      wallet.subtractMoney(paidAmount);
    }
    return paidAmount;
  }
}
// end::customer-correct[]
