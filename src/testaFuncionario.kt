fun testaFuncionario() {
    var funcionario = Analista(
        "Nome",
        "00000000",
        1000.0
    )
    println("Bonificação Funcionario: ${funcionario.bonificacao()}")

    var gerente = Gerente(
        "Nome",
        "00000000",
        2000.0,
        1234
    )

    println("Bonificação Gerente: ${gerente.bonificacao()}")
    if (gerente.autentica(2234)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    var diretor = Diretor(
        "Nome",
        "00000000",
        4000.0,
        1234,
        200.0
    )

    println("Bonificação Diretor: ${diretor.bonificacao()}")
    if (diretor.autentica(1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val analista = Analista(
        "Nome",
        "00000000000,",
        3000.0
    )
    println("Bonificação analista: ${analista.bonificacao()}")

    val calculadora = Calculadora()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(analista)
    println("Total bonificação: ${calculadora.total}")
}