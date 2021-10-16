class ContaPoupanca(
    override var titular: String,
    override val numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        super.saca(valor)
    }

}