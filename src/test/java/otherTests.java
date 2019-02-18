import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class otherTests {

    void throwError() throws Exception {
        throw new Exception("Do not call me");
    }

    static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }


    @Test
    @DisplayName("8 asserts")
    @Disabled
    void eightAssertions() {
        Account account = new Account();
        account.balance = -1;

        Account account2 = new Account();
        account2.balance = -1;

        assertAll("all asserts",
                () -> assertEquals(-1, account.balance),
                () -> assertEquals(-0.99, account.balance, .1),
                () -> assertTrue(account.balance < 0),
                () -> assertFalse(account.balance == 0),
                () -> assertThrows(Exception.class, this::throwError),
                () -> assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                () -> assertTimeout(Duration.ofSeconds(5), () -> {
                    try {
                        Thread.sleep(8000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    assertTrue(true);

                }),
                () -> assertDoesNotThrow(this::random),
                () -> assertEquals("Test string", "Not test string", ()-> {
                    System.out.println("The strings does not match");
                    return "The strings does not match";
                })
    
        );


    }

    /*
    Expect 2 - 3 fails
    1 for the timeout
    1 for the custom message
    and some times 1 for the random bool
     */
    @Test
    @DisplayName("8 active asserts")
    void eightActiveAssertions() {
        Account account = new Account();
        account.balance = -1;

        Account account2 = new Account();
        account2.balance = -1;

        assertAll("all asserts",
                () -> assertEquals(-1, account.balance),
                () -> assertEquals(-0.99, account.balance, .1),
                () -> assertTrue(account.balance < 0),
                () -> assertFalse(account.balance == 0),
                () -> assertThrows(Exception.class, this::throwError),
                () -> assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                () -> assertTimeout(Duration.ofSeconds(5), () -> {
                    try {
                        Thread.sleep(8000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    assertTrue(true);

                }),
                () -> assertDoesNotThrow(this::random),
                () -> assertEquals("Test string", "Not test string", ()-> {
                    System.out.println("The strings does not match");
                    return "The strings does not match";
                })

        );


    }

    void random() {
        assertTrue(getRandomBoolean());
    }
}
