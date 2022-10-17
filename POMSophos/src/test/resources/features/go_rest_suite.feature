#Author: santiago.moreno@sophossolutions.com
Feature: Uso de API GoRest
  Yo como aprendiz
  Quiero automatizar el consumo de una la API de GoRest
  Para conocer el funcionamiento de los métodos POST, GET y DELETE

  Scenario: Crear un nuevo usuario, consultarlo y eliminarlo - POST, GET, DELETE
    Given deseo establecer la base uri "https://gorest.co.in/"
    When ejecuto el metodo post en el endpoint "public/v2/users" y envío la siguiente información
      | name   | Cristiano Ronaldo |
      | gender | male              |
      | email  | cr7@elmejor.com   |
      | status | active            |
    And valido que el status_code sea 201 y los datos de la reserva sean
      | name   | Cristiano Ronaldo |
      | gender | male              |
      | email  | cr7@elmejor.com   |
      | status | active            |
    And ejecuto el metodo get en el endpoint "public/v2/users/" para el último usuario consultado
    And valido que el status_code sea 200 y los datos de la reserva sean
      | name   | Cristiano Ronaldo |
      | gender | male              |
      | email  | cr7@elmejor.com   |
      | status | active            |
    And ejecuto el metodo delete en el endpoint "public/v2/users/" para el último usuario consultado
    Then valido que el status_code sea 204




