#Author: alejandro.araque@sophossolutions.com
Feature: Ejemplo de consumo de API en GO REST
  Yo como aprendiz de automatización
  Quiero automatizar el consumo de una API de prueba
  Para entender el funcionamiento del consumo de API's

  @serviceGet
  Scenario: Consultar un usuario por medio de ID
    Given deseo establecer la base uri "https://gorest.co.in/"
    When deseo consultar la informacion en el endpoint "public/v2/users/" para el id "1434"
    Then valido que el status_code sea 200 y los datos de la reserva sean
      | name   | Chapal Mehra           |
      | email  | mehra_chapal@terry.net |
      | gender | male                   |
      | status | inactive               |

  @serviceDelete
    Scenario: eliminar un usuario
    Given deseo establecer la base uri "https://gorest.co.in/"
    When elimino un usuario en el endpoint "public/v2/users/" para el id "1434"
    Then valido que el status_code de eliminacion sea 204