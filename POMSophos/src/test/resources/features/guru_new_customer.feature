#Author: rigoberto.henao@sophossolutions.com
Feature: Demo POM
  Yo como instructor
  Necesito crear una base estable
  Para que los alumnos automaticen

  Background:
    Given Deseo ir a la página "https://demo.guru99.com/V4/"
    When Inicio sesion con los datos "mgr123" y "mgr!23"
    Then Valido que el mensaje de inicio sea "Manger Id : mgr123"

  Scenario: Crear usuario
    Given Deseo ir a la página siguiente "https://demo.guru99.com/V4/manager/addcustomerpage.php"
    When Creo sesion con los siguientes datos "Jean","male","23/12/1995","calle 25","Toronto","Ontario","123456","3216789012","jean@true.com","123456789"
    Then Valido que el texto de inicio sea "Customer Registered Successfully!!!"

