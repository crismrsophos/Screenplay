#Author: rigoberto.henao@sophossolutions.com
Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Actualizar Información Usuario Con Token - Patch en Booking
    Given "Cristian" desea consumir la información en la siguiente "<baseUrl>"
    When ejecuta el método patch booking "<endpoint>" con los siguientes datos
      | firstname   | lastname   | totalprice   | depositpaid   | checkin   | checkout   | additionalneeds   |
      | <firstname> | <lastname> | <totalprice> | <depositpaid> | <checkin> | <checkout> | <additionalneeds> |
    Then valida que el código de respuesta sea 200 y contenga los valores
      | firstname             | <firstname>       |
      | lastname              | <lastname>        |
      | totalprice            | <totalprice>      |
      | depositpaid           | <depositpaid>     |
      | bookingdates.checkin  | <checkin>         |
      | bookingdates.checkout | <checkout>        |
      | additionalneeds       | <additionalneeds> |

    Examples:
      | baseUrl                               | endpoint      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | https://restful-booker.herokuapp.com/ | booking/31594 | Erling    | Haaland  | 2500       | true        | 2021-07-02 | 2021-10-02 | me duele el estomago |