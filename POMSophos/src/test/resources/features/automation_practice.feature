#Author: alejandro.araque@sophossolutions.com
Feature: Compra en pagina de automatizacion
  Yo como aprendiz de automatización
  Necesito realizar una automatización en un sitio de prueba
  Para afianzar los conocimientos obtenidos durante la práctica anterior

  Scenario: Realizar automatizacion de una compra con un usuario previamente creado en una pagina de practica
    Given Deseo ir a la siguiente pagina "http://automationpractice.com/index.php"
    When Selecciono una camiseta e inicio sesion con los datos "alaraquema@gmail.com" y "contra1234"
    Then Valido que el monto sea "$35.02"