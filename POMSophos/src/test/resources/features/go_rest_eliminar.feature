#Author: alejandro.araque@sophossolutions.com, santiago.moreno@sophossolutions.com
Feature: Ejemplo de consumo de API en GO REST
  Yo como aprendiz de automatización
  Quiero automatizar el consumo de una API de prueba
  Para entender el funcionamiento del consumo de API's

  @serviceDelete
  Scenario: eliminar un usuario
    Given deseo establecer la base uri "https://gorest.co.in/"
    When elimino un usuario en el endpoint "public/v2/users/" para el usuario creado
    Then valido que el status_code sea 204
