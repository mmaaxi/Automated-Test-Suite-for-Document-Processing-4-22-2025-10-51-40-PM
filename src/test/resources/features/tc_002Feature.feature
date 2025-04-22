Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir y previsualizar archivo PDF/DOCX dentro del límite
    Given El usuario está en la página de subida de archivos
    When El usuario selecciona un archivo válido en formato PDF
    Then El archivo se carga exitosamente
    And El usuario puede ver la vista previa del archivo con nombre, tamaño y tipo