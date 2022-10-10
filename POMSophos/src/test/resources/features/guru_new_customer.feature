#Author: alejandro.araque@sophossolutions.com
Feature: Demo POM
  Yo como aprendiz
  Necesito crear un ejemplo estable
  Para que el profesor me apruebe

  Background:
    Given Deseo ir a la página "https://demo.guru99.com/V4/"
    When Inicio sesion con los datos "mgr123" y "mgr!23"
    Then Valido que el mensaje de inicio sea "Manger Id : mgr123"

  Scenario: Agregar cliente en Guru
    Given Deseo ir a la pagina "https://demo.guru99.com/V4/manager/addcustomerpage.php"
    When Agrego un cliente en la pagina con los datos "Alejandro Araque Marin", "03/05/1995", "Diagonal 56 45 67", "Bello", "Antioquia", "123458", "3042467297", "elcangri99992@gmail.com" y "Messiel10"
    Then Valido que el mensaje de registro sea "Customer Registered Successfully!!!"