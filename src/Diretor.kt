class Diretor(
    nome: String,
    cpf: String,
    private val salario: Double,
    override val senha: Int,
    private val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}