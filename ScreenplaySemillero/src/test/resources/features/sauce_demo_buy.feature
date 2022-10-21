Background:
    Given "Camila" navega a la pagina "https://www.saucedemo.com/"
    When ingresa los siguientes datos
      | standard_user | secret_sauce |
    Then verifica que el mensaje sea "PRODUCTS"

Scenario: Adquirir un producto en sauce
  Given "