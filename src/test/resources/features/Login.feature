Feature: Iniciar sesion de usuario

  @LoginUser @HappyPath
  Scenario Outline: Iniciar sesion de manera exitosa con datos validos
    Given el usuario esta en pagina de inicio
    And selecciona el boton de iniciar sesion
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>" para iniciar sesion
    When selecciona el boton iniciar sesion
    Then inicia sesion de manera exitosa

    Examples:
      |username|password|
      |ffedr4sw  |123jk4     |