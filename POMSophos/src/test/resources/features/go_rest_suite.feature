#Author: santiago.moreno@sophossolutions.com
Feature: Uso de API GoRest
  Yo como aprendiz
  Quiero automatizar el consumo de una la API de GoRest
  Para conocer el funcionamiento de los métodos POST, GET y DELETE

  Scenario: Crear un nuevo usuario - POST
    Given deseo establecer la base uri "https://gorest.co.in/"
    When ejecuto el método get en el endpoint "public/v2/users"