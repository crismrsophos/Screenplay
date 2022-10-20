#Author: bryan.biojo@sophossolutions.com
Feature: Demo Screenplay
  Yo como aprendiz
  Necesito crear una automatización
  Para realizar una compra en Sauce Demo

  Background:
    Given "Darlene" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

  Scenario: Realizar compra de un artículo en Sauce Demo
    Given "Darlene" navega a la pagina "https://www.saucedemo.com/inventory.html"
    When selecciona el producto y diligencia los campos del formulario de checkout con los datos
      | Darlene | Alderson | 10002 |
    Then verifica que el mensaje mostrado "THANK YOU FOR YOUR ORDER"