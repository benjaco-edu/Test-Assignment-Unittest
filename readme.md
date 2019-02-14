assingmentid: 2


D 1. Set up a project capable of running unit tests
D 2. Implement the bank interest example

    A savings account in a bank earns a different rate of interest depending on the balance in the account

    A balance in the range $0 up to $100 has a 3% interest rate

    A balance over $100 and up to $1000 has a 5% interest rate

    A balance of $1000 and over have a 7% interest rate

D 3. Implement tests for the following method:
public double calculateYearlyInterest(Account account)
D 4. Implement test that uses at least 8 different assertions
D 5. Rename the “8 different assertions” test with an annotation and verify the test has been renamed
D 6. Set up an random Boolean and an assumption that the Boolean is true in the “8 different assertions“ test and
verify the test skips when the assumption is not met
D 7. Make the “8 different assertions” test sleep for 8 seconds and set an assert time out to 5 seconds and verify
the test fails
D 8. Use a lambda in the “8 different assertions” test, that first prints a system out message and then returns the
same message as assertion message
D 9. Use assertAll for the “8 different assertions” test
D 10. Disable the “8 different assertions test” with annotation and verify the test has been disabled
11. Implement your own launcher capable of executing the tests and extracting the results for the bank interest
example