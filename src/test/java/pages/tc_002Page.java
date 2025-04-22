package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By previewSection = By.id("previewSection");
    
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarArchivo(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public void validarCargaExitosa() {
        // Implementar lógica para validar la carga del archivo
        WebElement preview = driver.findElement(previewSection);
        if(!preview.isDisplayed()) {
            throw new AssertionError("La vista previa no está visible");
        }
    }

    public void validarVistaPrevia() {
        // Implementar lógica para validar nombre, tamaño y tipo del archivo en la vista previa
        WebElement preview = driver.findElement(previewSection);
        String vistaPreviaInfo = preview.getText();
        if(!vistaPreviaInfo.contains("Nombre: archivo.pdf") || 
           !vistaPreviaInfo.contains("Tamaño:") || 
           !vistaPreviaInfo.contains("Tipo: PDF")) {
            throw new AssertionError("La vista previa del archivo no es correcta");
        }
    }
}