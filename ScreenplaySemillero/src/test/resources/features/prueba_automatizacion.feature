Feature: Prueba de automatizacion
  Yo como alumno
  Deseo crear una muestra de como se automatizan servicios
  Para que aprendan con Screenplay

  Scenario Outline: Realizar compra en la pagina advantage
    Given "Cristian" navega a la pagina "https://tasks.evalartapp.com/automatization/"
    When Seleccionar usuario y contraseña de ingreso
      | <usuario> | <contraseña> |
    And Oprimir los botones y realizar suma
    Then  verifica que el mensaje sea "Felicidades, has terminado la prueba exitosamente" en "evalartapp"
    Examples:
      | usuario | contraseña                                       |
      | 492158  | 10df2f32286b7120My0zLTg1MTI5NA==30e0c83e6c29f1c3 |