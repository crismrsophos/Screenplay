Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Realizar registro en QA
    Given "Cristian" navega a la pagina "https://demoqa.com/"
    When Ingresa los siguientes datos de usuario
      | name   | lastName   | email   | gender   | mobileNumber   | dateOfBirthday   | subjects   | hobbies   | picture   | address   | state   | city   |
      | <name> | <lastName> | <email> | <gender> | <mobileNumber> | <dateOfBirthday> | <subjects> | <hobbies> | <picture> | <address> | <state> | <city> |
    Then verifica que el mensaje sea "Thanks for submitting the form"
    Examples:
      | name   | lastName | email                 | gender | mobileNumber | dateOfBirthday | subjects | hobbies | picture   | address | state   | city    |
      | Erling | Haaland  | manunited@yopmail.com | Male   | 3163408249   | 07 Feb 2000    | Maths    | Sports  | anuel.jpg | Av 42b  | Haryana | Panipat |