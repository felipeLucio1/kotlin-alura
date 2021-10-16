class Diretor(
    nome: String,
    cpf: String,
    private val salario: Double,
    private val senha: Int,
    private val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}