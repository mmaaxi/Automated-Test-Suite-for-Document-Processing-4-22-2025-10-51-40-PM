package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page uploadPage = PageFactory.initElements(driver, tc_002Page.class);

    @Given("El usuario está en la página de subida de archivos")
    public void el_usuario_está_en_la_página_de_subida_de_archivos() {
        driver.get("http://example.com/upload");
    }

    @When("El usuario selecciona un archivo válido en formato PDF")
    public void el_usuario_selecciona_un_archivo_válido_en_formato_PDF() {
        uploadPage.seleccionarArchivo("ruta/al/archivo.pdf");
    }

    @Then("El archivo se carga exitosamente")
    public void el_archivo_se_carga_exitosamente() {
        uploadPage.validarCargaExitosa();
    }

    @Then("El usuario puede ver la vista previa del archivo con nombre, tamaño y tipo")
    public void el_usuario_puede_ver_la_vista_previa_del_archivo_con_nombre_tamaño_y_tipo() {
        uploadPage.validarVistaPrevia();
    }
}