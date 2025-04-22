Feature: Validar selección de modo de carga de documentos

  Scenario: Selección de modo de carga de documentos
    Given el usuario está en la página de carga de documentos
    When selecciona la opción "cargar documentos"
    Then el sistema debe mostrar la opción de carga única y carga múltiple

  Scenario: Carga única de documentos
    Given el usuario seleccionó la opción "cargar documentos"
    When elige "carga en un solo archivo"
    Then se debe habilitar un único recuadro para subir el archivo

  Scenario: Carga múltiple de documentos
    Given el usuario seleccionó la opción "cargar documentos"
    When elige "cargar documentos por separado"
    Then se deben mostrar múltiples recuadros para cada documento requerido