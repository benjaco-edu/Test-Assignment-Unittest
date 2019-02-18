public class BankInterestRate {
    public static double calculateYearlyInterest(Account account){
        if (account.balance > 1000) {
            return 7.;
        }
        if (account.balance > 100) {
            return 5.;
        }
        if (account.balance >= 0) {
            return 3.;
        }
        return 0.;
    }
}
