#Author: bryan.biojo@sophossolutions.com
Feature: Demo Screenplay
  Yo como aprendiz
  Necesito crear una automatización
  Para realizar una compra en Sauce Demo

  Background:
    Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

    Scenario Outline: Realizar compra de un artículo
      Given "Darlene" selecciona el producto a comprar
      When va al carro de compras y diligencia los campos del formulario de checkout con los datos
        | <firstname> | <lastname> | <postalCode> |
      Then verifica que el mensaje sea "THANK YOU FOR YOUR ORDER"

      Examples:
        | firstname | lastname  | postalCode |
        | Darlene   | Alderson  | 10002      |