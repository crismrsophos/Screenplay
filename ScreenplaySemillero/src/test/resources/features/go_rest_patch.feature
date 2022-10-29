#Author: rigoberto.henao@sophossolutions.com
Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Actualizar Información Usuario Con Token - Patch
    Given "Lillo" desea consumir la información en la siguiente "<baseUrl>"
    When ejecuta el método patch "<id>" con los siguientes datos
      | name   | email   | status   | gender   |
      | <name> | <email> | <status> | <gender> |
    Then valida que el código de respuesta sea 200 y contenga los valores
      | id     | <id>     |
      | name   | <name>   |
      | email  | <email>  |
      | status | <status> |
      | gender | <gender> |

    Examples:
      | baseUrl                               | id   | name          | email                          | status   | gender |
      | https://gorest.co.in/public/v2/users/ | 3489 | Carlos Amparo | carlos.amparo@peligrositos.com | inactive | male   |
