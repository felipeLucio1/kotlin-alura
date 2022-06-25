interface Autenticavel {

    val senha: Int // essa implementação com senha é apenas para prática. Em cenário real, não é aconselhada!

    fun autentica(senha: Int): Boolean {
        return if (this.senha == senha) {
            println("Bem vindo")
            true
        } else {
            println("Falha na autenticação")
            false
        }
    }
}