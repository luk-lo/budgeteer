package budgeteer.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.jupiter.api.Test;

class AccountTest {
  @Test
  void namingTest() {
    Account account = new Account("testAccount", CurrencyUnit.EUR);
    assertThat("testAccount", equalTo(account.getName()));
  }

  @Test
  void currencyTest() {
    for (CurrencyUnit unit : CurrencyUnit.registeredCurrencies()) {
      Account account = new Account("testAccount", unit);
      assertThat(unit, equalTo(account.getCurrencyUnit()));
    }
  }

  @Test
  void zeroInitialBalanceTest() {
    Account account = new Account("testAccount", CurrencyUnit.EUR);
    Money zeroEuro = Money.of(CurrencyUnit.EUR, 0.00);
    assertThat(zeroEuro, equalTo(account.getBalance()));
  }

  @Test
  void nonZeroInitialBalanceTest() {
    Money initialBalance = Money.of(CurrencyUnit.EUR, 1.23);
    Account account = new Account("testAccount", initialBalance);
    assertThat(initialBalance, equalTo(account.getBalance()));
  }
}
