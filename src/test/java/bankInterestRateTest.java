import org.junit.Test;

import static org.junit.Assert.*;


public class bankInterestRateTest {

    @Test
    public void testCalculateYearlyInterestNegative1() {
        Account account = new Account();
        account.balance = -1;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(0, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest0() {
        Account account = new Account();
        account.balance = 0;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(3, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest1() {
        Account account = new Account();
        account.balance = 1;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(3, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest99d9() {
        Account account = new Account();
        account.balance = 99.9;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(3, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest100() {
        Account account = new Account();
        account.balance = 100;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(3, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest101() {
        Account account = new Account();
        account.balance = 101;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(5, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest999dot9() {
        Account account = new Account();
        account.balance = 999.9;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(5, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest1000() {
        Account account = new Account();
        account.balance = 1000;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(5, interestRate, 0.0001);
    }

    @Test
    public void testCalculateYearlyInterest1001() {
        Account account = new Account();
        account.balance = 1001;

        double interestRate = BankInterestRate.calculateYearlyInterest(account);

        assertEquals(7, interestRate, 0.0001);
    }


}