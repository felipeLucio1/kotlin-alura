abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    private val salario: Double,
    private val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double = salario * 0.1

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}