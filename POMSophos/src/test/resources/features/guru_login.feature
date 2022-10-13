#Author: rigoberto.henao@sophossolutions.com
Feature: Demo POM
  Yo como instructor 
  Necesito crear una base estable 
  Para que los alumnos automaticen

  Scenario: Iniciar sesión en Guru
    Given Deseo ir a la página "https://demo.guru99.com/V4/"
    When Inicio sesión con los datos "mgr123" y "mgr!23" en "Guru"
    Then Valido que el mensaje de inicio sea "Manger Id : mgr123"