#Author: juan.ayalag@sophossolutions.com
Feature: Automation practice
  Yo como estudiante
  Necesito crear una automatización
  Para validar el cálculo del valor total al comprar una t-shirt

  Scenario: Comprar camisetas en Automation Practice
    Given Deseo ir a la página "http://automationpractice.com/index.php"
    When Compro camisa de mujer con las siguientes caracteristicas "Blue", "8", "L", "juan.ayalag@sophossolutions.com", "1234sophos"
    Then Valido que el precio final de la compra es igual a "$134.08"
