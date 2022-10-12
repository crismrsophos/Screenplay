#Author: santiago.moreno@sophossolutions.com
Feature: Way2Automation
  Yo como aprendiz de automatización
  Necesito crear una automatización
  Para validar el registro de un nuevo usuario en Way2Automation

  Scenario Outline: Registro de nuevo usuario
    Given Deseo ir a la página "https://www.way2automation.com/demo.html"
    When Ubicarme en la sección de registro e ingresar
      | <section> | <name> | <phone> | <email> | <country> | <city> | <username> | <password> |
    Then Valido que el mensaje sea "This is just a dummy form, you just clicked SUBMIT BUTTON"

    Examples:
      | section      | name            | phone      | email              | country  | city   | username | password      |
      | Registration | James Rodriguez | 3008382525 | jamesr10@gmail.com | Colombia | Bogotá | Jamesr10 | mundialista10 |