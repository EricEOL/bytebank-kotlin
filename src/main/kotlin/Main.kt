fun main() {
    println("Welcome to ByteBank");
    variables();
}

fun variables() {
    val titular: String = "Rebecca Lopes";
    val numeroConta: Int = 1000;
    var saldo: Double = 0.0;
    saldo = 100.00;
    saldo = 0.0;

    println("Titular: $titular");
    println("Conta: $numeroConta | Saldo: $saldo");

    when {
        saldo > 0.0 -> println("Saldo positivo");
        saldo == 0.0 -> println("Saldo zerado");
        else -> println("Saldo negativo");
    }
}