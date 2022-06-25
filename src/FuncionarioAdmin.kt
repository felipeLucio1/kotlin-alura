abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    private val salario: Double,
    private val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun bonificacao(): Double = salario * 0.1

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}