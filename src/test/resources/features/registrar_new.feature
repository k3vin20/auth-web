Feature: Registrar nuevo usuario

  @RegistrarNew @HappyPath
  Scenario Outline: Registrar de manera exitosa un usuario con datos validos
    Given el usuario esta en pagina de inicio
    And selecciona el boton de registro
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>"
    When selecciona el boton registrar
    Then realiza el registro de manera exitosa

    Examples:
      |username | password|
      |jorge1u2 | j123   |