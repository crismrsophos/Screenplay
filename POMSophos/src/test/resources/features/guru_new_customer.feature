#Author: santiago.moreno@sophossolutions.com
Feature: Demo POM
  Yo como estudiante
  Necesito crear una automatización
  Para probar la creación de usuarios en la demo guru

  Background: Iniciar sesión en Guru
    Given Deseo ir a la página "https://demo.guru99.com/V4/"
    And Inicio sesion con los datos "mgr123" y "mgr!23"
    And Valido que el mensaje de inicio sea "Manger Id : mgr123"

  Scenario: Crear nuevo customer en Guru
    Given Deseo ir a la sección de new costumer "https://demo.guru99.com/V4/manager/addcustomerpage.php"
    When Diligencio los datos "Falcao Garcia", "male", "06/10/2010", "Avenida siempreviva 742", "Springfield", "Oregon", "123456", "3008382525", "falgar@gmail.com" y "ABC123"
    Then Valido que el mensaje de registro sea "Customer Registered Successfully!!!"