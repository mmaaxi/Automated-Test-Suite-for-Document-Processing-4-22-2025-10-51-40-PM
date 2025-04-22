package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el usuario ha iniciado sesión en el sistema")
    public void el_usuario_ha_iniciado_sesión_en_el_sistema() {
        page.iniciarSesion();
    }

    @When("el usuario completa la carga y procesamiento de documentos")
    public void el_usuario_completa_la_carga_y_procesamiento_de_documentos() {
        page.completarCargaYProcesamiento();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void el_sistema_genera_el_slip_de_salida() {
        Assert.assertTrue(page.verificarSlipDeSalidaGenerado());
    }

    @Then("el sistema guarda tanto los documentos originales como los datos extraídos en el historial de la solicitud")
    public void el_sistema_guarda_documentos_y_datos_en_historial() {
        Assert.assertTrue(page.verificarHistorialActualizado());
    }
}