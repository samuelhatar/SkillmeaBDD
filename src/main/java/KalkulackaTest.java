import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

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
    public void uzivatelVidiNaKalkulackeVysledok(int predpokladanyVysledok) {
        assertArrayEquals(predpokladanyVysledok);

    }

    @When("Uzivatel vydeli tieto dve cisla")
    public void uzivatelVydeliTietoDveCisla() {
        vypocitanyVysledok = prbeCislo / drhcislo
    }
}
