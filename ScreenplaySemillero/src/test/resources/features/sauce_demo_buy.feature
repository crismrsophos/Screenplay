#Author: your.email@your.domain.com
Feature: Iniciar sesion en Sauce Demo
  Yo como aprendiz
  Necesito crear una plantilla
  Para iniciar sesion en Sauce Demo

Background:
    Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

Scenario: Adquirir un producto en sauce
  Given "Camila" escoge un producto para adquirir
  When ingresa los datos de envio
      | AnuelAA | Badbunny | 6666 |
  Then Verifica que el mensaje sea "THANK YOU FOR YOUR ORDER"