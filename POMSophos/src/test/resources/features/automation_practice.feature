#Author: juan.ayalag@sophossolutions.com
Feature: Ejercicio 2 POM
  Se necesita hacer las pruebas
  para la compra en una tienda web.

  Scenario:
    Given Deseo ir a la página de ropa "http://automationpractice.com/index.php"
    When Compro camisa de mujer con las siguientes caracteristicas "Blue", "8", "L", "juan.ayalag@sophossolutions.com", "1234sophos"
    Then Valido la compra cuando el precio final es igual a este item "$134.08"

