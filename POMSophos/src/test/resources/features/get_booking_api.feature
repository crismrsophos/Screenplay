#Author: your.email@your.domain.com
Feature: Ejemplo consultar de reserva hostel
  Yo como aprendiz  
  Quiero automatizar el consumo de una API
  Para conocer su funcionamiento

  Scenario: Obtener una reserva método - GET
    Given deseo establecer la base uri "https://restful-booker.herokuapp.com/"
    When ejecuto el método get en el endpoint "booking/557"
    Then valido que el status_code sea 200 y los datos de la reserva sean
      | firstname             | Fabio     |
      | lastname              | Colque     |
      | bookingdates.checkin  | 2018-01-01 |
      | bookingdates.checkout | 2019-01-01 |
