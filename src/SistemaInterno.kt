class SistemaInterno {

    fun entrar(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem vindo ao Bytebank!")
        } else {
            println("Usuário ou senha incorreta!")
        }
    }
}