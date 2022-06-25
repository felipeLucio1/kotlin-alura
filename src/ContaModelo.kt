interface ContaModelo {
    var titular: String
    val numero: Int

    fun deposita(valor: Double)

    fun saca(valor: Double)
}