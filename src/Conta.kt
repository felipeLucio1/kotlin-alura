abstract class Conta(
    override var titular: String,
    override val numero: Int
): ContaModeloImp(titular, numero) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}