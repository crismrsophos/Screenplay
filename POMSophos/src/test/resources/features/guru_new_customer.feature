#Author: santiago.moreno@sophossolutions.com
Feature: Demo POM
  Yo como estudiante
  Necesito crear una automatización
  Para probar la creación de usuarios en la demo guru

  Background: Iniciar sesión en Guru
    Given Deseo ir a la página "https://demo.guru99.com/V4/"
    When Inicio sesión con los datos "mgr123" y "mgr!23" en "Guru"
    Then Valido que el mensaje de inicio sea "Manger Id : mgr123"

  Scenario: Agregar cliente en Guru
    Given Deseo ir a la pagina "https://demo.guru99.com/V4/manager/addcustomerpage.php"
    When Agrego un cliente en la pagina con los datos "Alejandro Araque Marin", "03/05/1995", "Diagonal 56 45 67", "Bello", "Antioquia", "123458", "3042467297", "rigo..messi.cr7@gmail.com" y "Messiel10"
    Then Valido que el mensaje de registro sea "Customer Registered Successfully!!!"