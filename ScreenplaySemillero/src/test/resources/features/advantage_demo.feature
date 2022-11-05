#Author: rigoberto.henao@sophossolutions.com
Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Realizar compra en la pagina advantage
    Given "Cristian" desea navegar en la siguiente <page>
    When Seleccionar categoria y caracteristicas especificas del producto
      | <category> | <productName> | <color> | <quantity> |
    And ingrese los siguientes datos
      | <user
    Then valida que el código de respuesta sea 200 y contenga los valores
    Examples:
      | page                                       | endpoint      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | https://www.advantageonlineshopping.com/#/ | booking/31594 | Erling    | Haaland  | 2500       | true        | 2021-07-02 | 2021-10-02 | me duele el estomago |
