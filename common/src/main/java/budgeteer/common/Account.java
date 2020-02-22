package budgeteer.common;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Account {

  private String name;
  private CurrencyUnit currencyUnit;
  private Money initialBalance;

  /**
   * Create a new account with a balance of zero.
   *
   * @param name A human-friendly name for the account
   * @param currencyUnit The currency unit of this account
   */
  public Account(String name, CurrencyUnit currencyUnit) {
    this.name = name;
    this.currencyUnit = currencyUnit;
    this.initialBalance = Money.ofMajor(currencyUnit, 0);
  }

  /**
   * Create a new account with an initial balance.
   *
   * @param name A human-friendly name for the account
   * @param initialBalance The initial balance
   */
  public Account(String name, Money initialBalance) {
    this.name = name;
    this.currencyUnit = initialBalance.getCurrencyUnit();
    this.initialBalance = initialBalance;
  }

  public String getName() {
    return this.name;
  }

  public Money getBalance() {
    return this.initialBalance;
  }

  public CurrencyUnit getCurrencyUnit() {
    return this.currencyUnit;
  }
}
