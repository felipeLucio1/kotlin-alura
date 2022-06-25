fun testaAutenticacao() {
    val sistema = SistemaInterno()

    val gerente = Gerente(
        "Felipe",
        "111.111.111-11",
        1000.0,
        1111
    )
    val diretor = Diretor(
        "Ray",
        "222.222.222-22",
        2000.0,
        2222,
        200.0
    )

    val cliente = Cliente(
        nome = "Eli",
        cpf = "333.333.333-33",
        senha = 3333
    )

    sistema.entrar(gerente, 1111)
    sistema.entrar(diretor, 2222)
    sistema.entrar(cliente, 3332)
}