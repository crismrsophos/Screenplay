#Author: juan.ayalag@sophossolutions.com, alejandro.araque@sophossolutions.com, santiago.moreno@sophossolutions.com
Feature: Automation practice
  Yo como aprendiz de automatización
  Necesito realizar una automatización en un sitio de prueba
  Para validar el cálculo del valor total al comprar una t-shirt

  Scenario: Compra con un usuario previamente creado en una pagina de practica
    Given Deseo ir a la página "http://automationpractice.com/index.php"
    When  Compro camisa de mujer con las siguientes caracteristicas "Blue", "8", "L", "juan.ayalag@sophossolutions.com", "1234sophos"
    Then  Valido que el precio final de la compra es igual a "$134.08"