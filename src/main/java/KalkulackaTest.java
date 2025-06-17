import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KalkulackaTest {

    int prbeCislo;
    int duhCislo;
    int vypocitanie; vysledku

    @Given("Uzivatel ma priradene dve cisla {int} a {int}")
    public void uzivatelMaPriradeneDveCislaA(int prvecislo, int fruhecisko) {
    prbeCislo = prvecislo;
    duhCislo = duhCislo;

    }

    @When("Uzivatel scita tieto dve cisla")
    public void uzivatelScitaTietoDveCisla() {

    }

    @Then("Uzivatel vidi na kalkulacke vysledok {int}")
    public void uzivatelVidiNaKalkulackeVysledok(int arg0) {

    }
}
