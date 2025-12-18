package fr.uvsq.coo.principles.demeter;

// tag::wallet[]
public class Wallet {
  private double totalMoney;

  public Wallet(double totalMoney) {
    this.totalMoney = totalMoney;
  }

  public double getTotalMoney() {
    return totalMoney;
  }

  public void subtractMoney(double amount) {
    this.totalMoney -= amount;
  }
}
// end::wallet[]
