#Author: alejandro.araque@sophossolutions.com
Feature: Automation practice
  Yo como aprendiz de automatización
  Necesito realizar una automatización en un sitio de prueba
  Para validar el cálculo de compra de elementos con precio menor

  Scenario: Compra con ingreso de usuario en la página saucedemo.com
    Given Deseo ir a la página "https://www.saucedemo.com/"
    When  Compro en sauce demo con los siguientes datos "standard_user", "secret_sauce", "Alejandro", "Araque" y "05515"
    Then  Valido que en sauce demo aparezca "Your order has been dispatched, and will arrive just as fast as the pony can get there!"