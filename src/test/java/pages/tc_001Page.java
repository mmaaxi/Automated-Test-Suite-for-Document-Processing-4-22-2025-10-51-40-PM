package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By cargarDocumentosOpcion = By.id("cargarDocumentos");
    By modoCargaUnica = By.id("unicoArchivo");
    By modoCargaMultiple = By.id("archivosMultiples");
    By recuadroUnico = By.id("recuadroUnico");
    By recuadrosMultiples = By.className("recuadroMultiple");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarOpcionCargarDocumentos(String opcion) {
        driver.findElement(cargarDocumentosOpcion).click();
    }

    public boolean verificarOpcionesCarga() {
        return driver.findElement(modoCargaUnica).isDisplayed() &&
               driver.findElement(modoCargaMultiple).isDisplayed();
    }

    public void elegirModoCarga(String modo) {
        if (modo.equals("carga en un solo archivo")) {
            driver.findElement(modoCargaUnica).click();
        } else if (modo.equals("cargar documentos por separado")) {
            driver.findElement(modoCargaMultiple).click();
        }
    }

    public boolean verificarRecuadroUnico() {
        return driver.findElement(recuadroUnico).isDisplayed();
    }

    public boolean verificarRecuadrosMultiples() {
        return driver.findElements(recuadrosMultiples).size() > 1;
    }
}