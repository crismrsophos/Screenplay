#Author: santiago.moreno@sophossolutions.com
Feature: Sauce Demo
  Yo como aprendiz de automatización
  Necesito crear una automatización
  Para validar la compra de productos menores a USD 20 en Sauce Labs

  Scenario Outline: Compra de productos menores a USD 20
    Given Deseo ir a la página "<url>"
    When Inicio sesión con los datos "<username>" y "<password>" en "<page>"
    And Selecciono los productos menores a "<maxValue>" y diligencio "<name>", "<lastName>" y "<postalCode>"
    Then Valido el mensaje "<finalPhrase>"

    Examples:
      | url                        | username      | password     | page  | maxValue | name  | lastName | postalCode | finalPhrase                                                                             |
      | https://www.saucedemo.com/ | standard_user | secret_sauce | Sauce | 20       | Akira | Toriyama | 1111       | Your order has been dispatched, and will arrive just as fast as the pony can get there! |