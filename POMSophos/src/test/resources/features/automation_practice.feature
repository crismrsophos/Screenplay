#Authors: leslie.morales, bryan.biojo (@sophossolutions.com)
Feature: Demo POM
  Yo como aprendiz
  Necesito crear una automatización
  Para validar el cálculo del valor total de la compra

  Scenario Outline: Realizar una compra en automation practice
    Given Deseo ir a la página "http://automationpractice.com/index.php"
    When Escojo el producto con las siguientes caracteristicas
      | <category> | <description> | <quantity> | <size> | <color> |
    And Inicio sesión con los datos del usuario "leslie.morales@sophossolutions.com" y "leslie123" en "Automation"
    Then Se muestra la respuesta <total>

    Examples:
      | category | description                 | quantity | size | color | total     |
      | T-shirts | Faded Short Sleeve T-shirts |       10 | M    | Blue  | "$167.10" |
     #| T-shirts | Faded Short Sleeve T-shirts |        5 | S    | Blue   | "$167.10" |
     #| T-shirts | Faded Short Sleeve T-shirts |        3 | L    | Blue   | "$167.10" |
     # | T-shirts | Faded Short Sleeve T-shirts |        1 | M    | Orange | "$167.10" |
     # | T-shirts | Faded Short Sleeve T-shirts |        2 | S    | Orange | "$167.10" |
     # | T-shirts | Faded Short Sleeve T-shirts |        2 | L    | Orange | "$167.10" |