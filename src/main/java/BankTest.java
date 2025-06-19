import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    BankAccount firstBankAccount;
    BankAccount secondBankAccount;


    @Given("Bank account with {int} euro")
    public void bankAccountWithEuro(int initialBalance) {
        firstBankAccount = new initialBalance (initialBalance);
    }

    @Then("A user account balance is {int} euro")
    public void aUserAccountBalanceIsEuro(int expectedBalance) {
        assertEquals(expectedBalance, firstBankAccount.getAccountBalance());

    }

    @When("A user with withdraw {int} euro")
    public void aUserWithWithdrawEuro(int withdrawAmount) {
        firstBankAccount.withdraw(withdrawAmount);
    }

    @And("A user transfer {int} euro to this account")
    public void aUserTransferEuroToThisAccount(int tranfereAmount) {
        firstBankAccount.transfer(tranfereAmount);
    }

    @And("another Bank account with {int} euro")
    public void anotherBankAccountWithEuro(int inicialBalance) {
        secondBankAccount = new BankAccount(inicialBalance)
    }

    @When("A user transfere from first bank account to second one {int} euro")
    public void aUserTransfereFromFirstBankAccountToSecondOneEuro(int transferAmout) {
        firstBankAccount.withdraw(transferAmout);
        secondBankAccount.withdraw(transferAmout)

    }

    @And("A user second account balance is {int} euro")
    public void aUserSecondAccountBalanceIsEuro(int expectedBalance) {
        assertEquals(expectedBalance, secondBankAccount.getAccountBalance());
    }
}
