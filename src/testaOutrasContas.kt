fun testaOutrasContas() {
    val contaPoupanca = ContaPoupanca(
        "Felipe",
        1000,
        0.005
    )
    contaPoupanca.deposita(1000.0)
    contaPoupanca.dapositaRemuneracao()

    val contaCorrente = ContaCorrente(
        "Rayane",
        1001
    )
    contaCorrente.deposita(1000.0)
    println("Saldo poupança após depósito: ${contaPoupanca.saldo}")
    println("Saldo corrente após depósito: ${contaCorrente.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo corrente após saque: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo poupança após transferência: ${contaPoupanca.saldo}")
    println("Saldo corrente após transferência: ${contaCorrente.saldo}")
}