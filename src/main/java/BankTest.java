import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import product.BankAccount;

public class BankTest {

    BankAccount firstBankAccount;


    @Given("Bank account with {int} euro")
    public void bankAccountWithEuro(int initialBalance) {
        firstBankAccount = new initialBalance (initialBalance);
    }

    @Then("A user account balance is {int} euro")
    public void aUserAccountBalanceIsEuro(int expectedBalance) {

    }
}
