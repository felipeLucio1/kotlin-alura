class ContaPoupanca(
    override var titular: String,
    override val numero: Int,
    var remuneracao: Double
) : Conta(
    titular = titular,
    numero = numero
) {
    private fun remuneraPoupanca(): Double {
        return this.saldo*remuneracao
    }

    fun dapositaRemuneracao() {
        this.deposita(remuneraPoupanca())
    }
}