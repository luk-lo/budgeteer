package budgeteer.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class AccountTest {
  @Test
  void namingTest() {
    Account account = new Account("testAccount");
    assertThat("testAccount", equalTo(account.getName()));
  }
}
