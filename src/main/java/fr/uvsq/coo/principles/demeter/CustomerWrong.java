package fr.uvsq.coo.principles.demeter;

// tag::customer-wrong[]
public class CustomerWrong {
  private Wallet wallet;

  public CustomerWrong(double fortune) {
    this.wallet = new Wallet(fortune);
  }

  public Wallet getWallet() { //<1>
    return wallet;
  }
}
// end::customer-wrong[]
