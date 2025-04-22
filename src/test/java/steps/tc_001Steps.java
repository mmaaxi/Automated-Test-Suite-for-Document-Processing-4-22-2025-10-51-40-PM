package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page = PageFactory.initElements(driver, tc_001Page.class);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver.get("url_de_la_página");
    }

    @When("selecciona la opción {string}")
    public void selecciona_la_opción(String opcion) {
        page.seleccionarOpcionCargarDocumentos(opcion);
    }

    @Then("el sistema debe mostrar la opción de carga única y carga múltiple")
    public void el_sistema_debe_mostrar_la_opción_de_carga_única_y_carga_múltiple() {
        assertTrue(page.verificarOpcionesCarga());
    }

    @When("elige {string}")
    public void elige(String modo) {
        page.elegirModoCarga(modo);
    }

    @Then("se debe habilitar un único recuadro para subir el archivo")
    public void se_debe_habilitar_un_único_recuadro_para_subir_el_archivo() {
        assertTrue(page.verificarRecuadroUnico());
    }

    @Then("se deben mostrar múltiples recuadros para cada documento requerido")
    public void se_deben_mostrar_múltiples_recuadros_para_cada_documento_requerido() {
        assertTrue(page.verificarRecuadrosMultiples());
    }
}