#Authors: leslie.morales, bryan.biojo (@sophossolutions.com)
Feature: Demo POM
  Yo como aprendiz
  Necesito crear una automatización
  Para validar el cálculo del valor total de la compra

  Scenario: Realizar una compra en automation practice
    Given Deseo ir a la página "http://automationpractice.com/index.php"
    When Compro camisa de mujer con las siguientes caracteristicas "Blue", "8", "L", "juan.ayalag@sophossolutions.com", "1234sophos"
    Then Valido que el precio final de la compra es igual a "$134.08"


