class Diretor(
    nome: String,
    cpf: String,
    private val salario: Double,
    private val senha: Int,
    private val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }
}