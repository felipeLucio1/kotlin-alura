abstract class Funcionario(
    nome: String,
    cpf: String,
    private val salario: Double
    ) {

    open fun bonificacao(): Double = salario * 0.1

}