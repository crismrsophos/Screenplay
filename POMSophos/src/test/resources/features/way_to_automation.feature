#Author: juan.ayalag@sophossolutions.com
Feature: Demo POM
  Yo como alumno de semillero de automatización
  Necesito crear un registro de usuario en la página Way2
  Para la tarea numero 3


  Scenario Outline: Registro dummy usuario
    Given Deseo ir a la página "<page>"
    When Registro usuario con los siguientes datos
      | <name> | <phone> | <email> | <country> | <city> | <user> | <password> |
    Then Valido que registre el usuario "This is just a dummy form, you just clicked SUBMIT BUTTON"

    Examples:
      | page                                     | name | phone      | email          | country  | city    | user   | password |
      | https://www.way2automation.com/demo.html | Jean | 3248901234 | jean@false.com | colombia | pereira | jean10 | 1234jean |

