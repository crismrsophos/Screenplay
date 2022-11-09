#Author: rigoberto.henao@sophossolutions.com
Feature: Automatización de Patch
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Realizar compra en la pagina advantage
    Given "Cristian" navega a la pagina "https://www.advantageonlineshopping.com/#/"
    When Seleccionar categoria y caracteristicas especificas del producto
      | category   | product   | color   | quantity   |
      | <category> | <product> | <color> | <quantity> |
    And ingrese los siguientes datos
      | username   | password   |
      | <username> | <password> |
    Then  verifica que el mensaje sea "Welcome to the world's largest community of freelance software testers!"
    Examples:
      | category | product                    | color | quantity | username      | password  |
      | tablets  | HP Elite x2 1011 G1 Tablet | GRAY  | 1        | CristianoSIUU | Bicho1315 |
