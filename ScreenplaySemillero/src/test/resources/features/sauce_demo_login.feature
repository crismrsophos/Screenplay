#Author: your.email@your.domain.com
Feature: Iniciar sesión en Sauce Demo
  Yo como aprendiz
  Necesito crear una plantilla
  Para iniciar sesión en Sauce Demo

  #Scenario: Login o Iniciar Sesion Sauce Demo
    #Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    #When ingresa los siguientes datos
      #| standard_user | secret_sauce |
    #Then verifica que el mensaje sea "PRODUCTS"

  Scenario: Compra en Sauce Demo
    Given "Darlene" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    And selecciona el producto a comprar y diligencia los campos del formulario de checkout con los datos
      | Darlene | Alderson | 10002 |
    Then verifica que el mensaje sea "THANK YOU FOR YOUR ORDER"

