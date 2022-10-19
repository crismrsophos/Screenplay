#Author: alejandro.araque@sophossolutions.com, santiago.moreno@sophossolutions.com
Feature: Ejemplo de consumo de API en GO REST
  Yo como aprendiz de automatización
  Quiero automatizar el consumo de una API de prueba
  Para entender el funcionamiento del consumo de API's

  @servicePost
  Scenario: Postear un usuario con unos datos
    Given deseo establecer la base uri "https://gorest.co.in/"
    When agrego en el endpoint "public/v2/users/" los siguientes datos
      | name   | Ichigo Kurosaki           |
      | email  | Ichigo.Bleach381@gmail.com |
      | gender | male                      |
      | status | active                    |
    Then valido que el status_code sea 201
