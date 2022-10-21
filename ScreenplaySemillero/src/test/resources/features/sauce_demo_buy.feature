#Author: bryan.biojo@sophossolutions.com
Feature: Demo Screenplay
  Yo como aprendiz
  Necesito crear una automatización
  Para realizar una compra en Sauce Demo

  Background: Iniciar sesión Sauce Demo
    Given "Darlene" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

  Scenario: Realizar compra de un artículo en Sauce Demo
    Given "Darlene" selecciona el producto "Sauce Labs Bike Light"
    When diligencia los campos del formulario de checkout con los datos
      | Darlene | Alderson | 10002 |
    Then verifica que el mensaje mostrado "THANK YOU FOR YOUR ORDER"

  #Scenario: Realizar compra de artículos menores de $20.00 en Sauce Demo
    #Given "Darlene" navega a la pagina "https://www.saucedemo.com/inventory.html"
    #When selecciona los productos con precio menor a "$20.00"
    #And diligencia los campos del formulario de checkout con los datos
     # | Darlene | Alderson | 10002 |
    #Then verifica que el mensaje mostrado "THANK YOU FOR YOUR ORDER"