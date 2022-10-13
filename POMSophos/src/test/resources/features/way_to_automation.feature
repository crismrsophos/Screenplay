#Author: alejandro.araque@sophossolutions.com y santiago.moreno@sophossolutions.com
Feature: Way to automation
  Yo como aprendiz de automatización
  Necesito realizar un registro de un nuevo usuario en la página way2automation.com
  Para realizar de forma satisfactoria el registro de un usuario en el sitio

  Scenario Outline: Registro de nuevo usuario en la pagina Way 2 automation
    Given Deseo ir a la página "https://www.way2automation.com/demo.html"
    When Registro al usuario en Way2 con los siguientes datos
      | <Name> | <Phone> | <Email> | <Country> | <City> | <Username> | <Password> |
    Then Valido que en way2 aparezca el mensaje de validacion igual a <Message>

    Examples:
      | Name            | Phone      | Email                | Country  | City     | Username       | Password      | Message                                                     |
      | Alejandro       | 3042467297 | alaraquema@gmail.com | Colombia | Medellin | alaraqueMaster | messi1234     | "This is just a dummy form, you just clicked SUBMIT BUTTON" |
      | James Rodriguez | 3008382525 | jamesr10@gmail.com   | Colombia | Bogotá   | Jamesr10       | mundialista10 | "This is just a dummy form, you just clicked SUBMIT BUTTON" |