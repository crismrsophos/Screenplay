#Author: alejandro.araque@sophossolutions.com y santiago.moreno@sophossolutions.com
Feature: Automatizacion compra SauceDemo
  Yo como aprendiz de automatizacion
  Necesito comprar todos los productos con precio menor a 20 doláres
  Para validar el funcionamiento de la página

  Scenario Outline: Compra de productos menores a USD 20
    Given Deseo ir a la página "<Url>"
    When  Inicio sesión con los datos "<Username>" y "<Password>" en "<Page>"
    And   Cuando compro en sauce demo con los siguientes datos
      | <FirstName> | <LastName> | <PostalCode> | <MaxValue> |
    Then  Valido el mensaje "<Message>"

    Examples:
      | Url                        | Username      | Password     | Page      | MaxValue | FirstName | LastName     | PostalCode | Message                                                                                 |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | SauceDemo | 20       | Alejandro | Araque Marín | 05515      | Your order has been dispatched, and will arrive just as fast as the pony can get there! |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | SauceDemo | 20       | Akira     | Toriyama     | 1111       | Your order has been dispatched, and will arrive just as fast as the pony can get there! |