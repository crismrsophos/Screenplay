#Author: cristian.monsalve@sophossolutions.com
Feature: Iniciar sesion en Sauce Demo
  Yo como aprendiz
  Necesito crear una plantilla
  Para iniciar sesion en Sauce Demo

  Scenario:
    Given "Cristian" navega a la pagina "https://www.utest.com/"
    When suministra los siguientes datos
      | Camus | Acuario | camus@yopmail.com | Febrero | 7 | 2000 | English | French |
    And suministra los datos de direccion
      | Medellin | 050044 | Colombia |
    And suministra la contraseña
      | Madrid1315 | Madrid1315 |
    Then verifica que el mensaje sea "Welcome to the world's largest community of freelance software testers!"

