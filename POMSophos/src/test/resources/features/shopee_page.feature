#Author: rigoberto.henao@sophossolutions.com
Feature: Demo POM
  Yo como instructor
  Necesito crear una base estable
  Para que los alumnos automaticen

  Scenario Outline: Agregar al carrito de aliexpress
    Given Deseo ir a la página "https://best.aliexpress.com/"
    When Escoje los siguientes productos
      | <quantity> | <color> |
    And se muestra el <total>
    Then Valido que el mensaje de inicio sea "Iniciar sesion"

    Examples:
      | quantity | color |
      | 2        | blue  |
