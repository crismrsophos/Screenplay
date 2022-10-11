#Author: alejandro.araque@sophossolutions.com
Feature: Way to automation
  Yo como aprendiz de automatización
  Necesito realizar un registro de un nuevo usuario en la página way2automation.com
  Para realizar de forma satisfactoria el registro de un usuario en el sitio

  Scenario Outline: Registrarse en la pagina Way 2 automation
    Given Deseo ir a la página "https://www.way2automation.com/demo.html"
    When Registro al usuario en Way2 con los siguientes datos
    | <Name> | <Phone> | <Email> | <Country> | <City> | <Username> | <Password> |
    Then Valido que en way2 aparezca el mensaje de validacion igual a <Mensaje>

    Examples:
      |  Name       |  Phone       |  Email                 |  Country   |  City      |  Username        |  Password   |  Mensaje                                                      |
      |  Alejandro  |  3042467297  |  alaraquema@gmail.com  |  Colombia  |  Medellin  |  alaraqueMaster  |  messi1234  |  "This is just a dummy form, you just clicked SUBMIT BUTTON"  |