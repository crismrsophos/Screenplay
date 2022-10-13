#Author: juan.ayalag@sophossolutions.com
Feature: Demo POM
  Yo como alumno de semillero de automatización
  Necesito ir a una pagina de venta de articulos y seleccionar
  todos los articulos menores a 20 dolares.

  Scenario Outline: Registro login usuario
    Given Deseo ir a la página "<page>"
    When Inicio sesión con los datos "standard_user" y "secret_sauce" en "Sauce"
    Then Valido que registre el usuario "This is just a dummy form, you just clicked SUBMIT BUTTON"

    Examples:
      | page                       |
      | https://www.saucedemo.com/ |

