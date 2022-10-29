#Author: cristian.monsalve@sophossolutions.com
Feature: Automatización de metodo post
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Establecer datos de Usuario Con Token - Post
    Given "Levi" desea consumir la información en la siguiente "<baseUrl>"
    When ejecuta el método post "<endpoint>" con los siguientes datos
      | name   | email   | body       |
      | <name> | <email> | <comments> |
    Then valida que el código de respuesta sea 201 y contenga los valores
      | name  | <name>     |
      | email | <email>    |
      | body  | <comments> |


    Examples:
      | baseUrl               | endpoint                   | name          | email                         | comments         |
      | https://gorest.co.in/ | public/v2/posts/2/comments | levi Ackerman | leeevitt.ackerman@yopmail.com | que hay pa hacer |
