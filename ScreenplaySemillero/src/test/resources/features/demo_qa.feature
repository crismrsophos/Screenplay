Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Realizar compra en la pagina advantage
    Given "Cristian" desea navegar en la siguiente <page>
    When Ingresa los siguientes datos de usuario
      | <name> | <lastName> | <email> | <gender> | <mobileNumber> | <dateOfBirthday> | <subjects> | <hobbies> | <picture> | <address> | <state> | <city> |
    Then valida que el código de respuesta sea 200 y contenga los valores
    Examples:
      | page                                       | name   | lastName | email                 | gender | mobileNumber | dateOfBirthday | subjects | hobbies | picture   | address | state   | city    |
      | https://www.advantageonlineshopping.com/#/ | Erling | Haaland  | manunited@yopmail.com | Male   | 3163408249   | 07 Feb 2000    | Maths    | Sports  | anuel.jpg | Av 42b  | Haryana | Panipat |