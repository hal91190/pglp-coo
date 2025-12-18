package fr.uvsq.coo.principles.demeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemeterTest {
  @Test
  public void wrongSellItemTo() {
    final double FORTUNE = 150.0;
    final double AMOUNT_TO_PAY = 100.0;
    final double REMAINING = 50.0;
    CustomerWrong customer = new CustomerWrong(FORTUNE);

    // tag::merchant-wrong[]
    Wallet wallet = customer.getWallet();
    double totalMoney = wallet.getTotalMoney();
    if (totalMoney > AMOUNT_TO_PAY) {
      wallet.subtractMoney(AMOUNT_TO_PAY);
    }
    // end::merchant-wrong[]

    assertEquals(customer.getWallet().getTotalMoney(), REMAINING);
  }

  @Test
  public void correctSellItemTo() {
    final double FORTUNE = 150.0;
    final double AMOUNT_TO_PAY = 100.0;
    final double REMAINING = 50.0;
    Customer customer = new Customer(FORTUNE);

    // tag::merchant-correct[]
    double paidAmount = customer.getPayment(AMOUNT_TO_PAY);
    // end::merchant-correct[]

    assertEquals(paidAmount, AMOUNT_TO_PAY);
  }
}
