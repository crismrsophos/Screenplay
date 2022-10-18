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
      | email  | Ichigo.Bleach38@gmail.com |
      | gender | male                      |
      | status | active                    |
    Then valido que el status_code sea 201

  @serviceGet
  Scenario: Consultar un usuario por medio de ID
    Given deseo establecer la base uri "https://gorest.co.in/"
    When consulto la informacion en el endpoint "public/v2/users/" para el usuario creado
    Then valido que el status_code sea 200 y los datos de la reserva sean
      | name   | Ichigo Kurosaki           |
      | email  | Ichigo.Bleach38@gmail.com |
      | gender | male                      |
      | status | active                    |

  @serviceDelete
  Scenario: eliminar un usuario
    Given deseo establecer la base uri "https://gorest.co.in/"
    When elimino un usuario en el endpoint "public/v2/users/" para el usuario creado
    Then valido que el status_code sea 204