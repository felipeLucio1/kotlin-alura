class SistemaInterno {

    fun entrar(funcionarioAdmin: FuncionarioAdmin, senha: Int) {
        if (funcionarioAdmin.autentica(senha)) {
            println("Bem vindo ao Bytebank!")
        } else {
            println("Usuário ou senha incorreta!")
        }
    }
}