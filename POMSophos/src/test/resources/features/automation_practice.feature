#Author: santiago.moreno@sophossolutions.com
Feature: Automation practice
  Yo como estudiante
  Necesito crear una automatización
  Para probar el cálculo del valor total cuando a voy a comprar una t-shirt en la automation practice

  Scenario: Comprar camisetas en Automation Practice
    Given Deseo ir a la página "https://automationpractice.com/index.php"
    When Ingreso a la sección de T-Shirts
    And Selecciono la camiseta azul
    And Ingreso cantidad y talla "5" y "S"
    And Agrego la camiseta al carro de compras
    And Procedo a hacer checkout
    And Inicio sesion con "jamesr10@gmail.com" y "jamesr10123"
    And Acepto los términos de servicio
    Then Valido que el cálculo del valor unitario multiplicado por la cantidad, más los impuestos, más el envío, sea igual al valor total mostrado por la página