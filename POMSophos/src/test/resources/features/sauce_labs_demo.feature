#Author: alejandro.araque@sophossolutions.com
Feature: Automatizacion compra SauceDemo
  Yo como aprendiz de automatizacion
  Necesito comprar todos los productos con precio menor a 20 doláres
  Para validar el funcionamiento de la página

  Scenario Outline: Compra con ingreso de usuario en la página saucedemo.com
    Given Deseo ir a la página "https://www.saucedemo.com/"
    When  Cuando compro en sauce demo con los siguientes datos
    | <User> | <Password> | <FirstName> | <LastName> | <PostalCode> |
    Then  Valido que en sauce demo aparezca <Message>

    Examples:
      | User          | Password     | FirstName |  LastName    | PostalCode | Message                                                                                   |
      | standard_user | secret_sauce | Alejandro | Araque Marín | 05515      | "Your order has been dispatched, and will arrive just as fast as the pony can get there!" |