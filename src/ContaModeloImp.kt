abstract class ContaModeloImp(
    override var titular: String,
    override val numero: Int
): ContaModelo {
    var saldo = 0.0
        protected set

    override fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}