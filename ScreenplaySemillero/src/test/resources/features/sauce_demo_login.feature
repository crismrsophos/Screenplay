#Author: your.email@your.domain.com
Feature: Iniciar sesion en Sauce Demo
  Yo como aprendiz  
  Necesito crear una plantilla 
  Para iniciar sesion en Sauce Demo

  Scenario: Login o Iniciar Sesion Sauce Demo
    Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"
