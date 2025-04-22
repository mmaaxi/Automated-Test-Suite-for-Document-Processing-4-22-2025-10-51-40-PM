package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By iniciarSesionButton = By.id("loginButton");
    By cargarDocumentosButton = By.id("uploadDocumentsButton");
    By procesarDocumentosButton = By.id("processDocumentsButton");
    By slipDeSalidaElement = By.id("outputSlip");
    By historialElement = By.id("history");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        driver.findElement(iniciarSesionButton).click();
    }

    public void completarCargaYProcesamiento() {
        driver.findElement(cargarDocumentosButton).click();
        driver.findElement(procesarDocumentosButton).click();
    }

    public boolean verificarSlipDeSalidaGenerado() {
        WebElement slipDeSalida = driver.findElement(slipDeSalidaElement);
        return slipDeSalida.isDisplayed();
    }

    public boolean verificarHistorialActualizado() {
        WebElement historial = driver.findElement(historialElement);
        return historial.isDisplayed();
    }
}