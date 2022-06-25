class ContaSalario(
    override var titular: String,
    override val numero: Int
): ContaModeloImp(titular, numero) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}