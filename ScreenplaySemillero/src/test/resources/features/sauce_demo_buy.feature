#Author: bryan.biojo@sophossolutions.com, cristian.monsalve@sophossolutiions.com, alejandro.araque@sophossolutions.com
Feature: Demo Screenplay
  Yo como aprendiz
  Necesito crear una automatización
  Para realizar una compra en Sauce Demo

  Background: Iniciar sesión Sauce Demo
    Given "Tupac" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

  Scenario: Realizar compra de un artículo en Sauce Demo
    Given "Tupac" selecciona el producto "Sauce Labs Bike Light"
    When diligencia los campos del formulario de checkout con los datos
      | Radamel | SIUUU | 10002 |
    Then verifica que el mensaje mostrado sea "THANK YOU FOR YOUR ORDER"
