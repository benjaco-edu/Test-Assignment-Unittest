import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class UnitTestLuncher {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(bankInterestRateTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("Success");
        }else {
            System.out.println("Failed");
            System.exit(-1);
        }
    }
}
