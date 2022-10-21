#Author: your.email@your.domain.com

Feature: Demo Screenplay
  Yo como aprendiz
  Necesito crear una automatización
  Para iniciar sesión en Sauce Demo

  Scenario: Iniciar sesión Sauce Demo
    Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

