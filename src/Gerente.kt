

class Gerente(
    nome: String,
    cpf: String,
    private val salario: Double,
    override val senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
}