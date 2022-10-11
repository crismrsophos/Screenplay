#Author: alejandro.araque@sophossolutions.com
Feature: Way to automation
  Yo como aprendiz de automatización
  Necesito realizar un registro de un nuevo usuario en la página way2automation.com
  Para realizar el registro de un usuario en el sitio

  Scenario: Compra con un usuario previamente creado en una pagina de practica
    Given Deseo ir a la página "http://automationpractice.com/index.php"
    When Compro camisa de mujer con las siguientes caracteristicas "Blue", "8", "L", "juan.ayalag@sophossolutions.com", "1234sophos"
    Then Valido que el precio final de la compra es igual a "$134.08"