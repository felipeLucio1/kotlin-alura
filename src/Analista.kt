class Analista(
    nome: String,
    cpf: String,
    private val salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario*1.1
    }
}