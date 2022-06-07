class Gerente(
    nome: String,
    cpf: String,
    private val salario: Double,
    private val senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }
}