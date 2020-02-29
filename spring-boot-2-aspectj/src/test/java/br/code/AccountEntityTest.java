package br.code;

import br.code.account.AccountEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountEntityTest {

    private AccountEntity accountEntity;

    @Before
    public void before() {
        accountEntity = new AccountEntity();
    }

    @Test
    public void given20AndMin10_whenWithdraw5_thenSuccess() {
        Assert.assertTrue(accountEntity.withdraw(5));
    }

    @Test
    public void given20AndMin10_whenWithdraw100_thenFail() {
        Assert.assertFalse(accountEntity.withdraw(100));
    }

}
