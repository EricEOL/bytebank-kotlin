fun main() {
    println("Welcome to ByteBank");
    val conta = Conta();
    conta.titular = "Eric";
    conta.numero = 1000;
    conta.saldo = 1000.0;
    println("Conta 1: ${conta.titular}");

    val contaDaRebecca = Conta();
    contaDaRebecca.titular = "Rebecca";
    contaDaRebecca.numero = 3000;
    contaDaRebecca.saldo = 1000000.0;
    println("Conta 2 ${contaDaRebecca.titular}")
}

class Conta {
    var titular: String = "";
    var numero: Int = 0;
    var saldo: Double = 0.0;
}

fun variables() {
    val titular: String = "Rebecca Lopes";
    val numeroConta: Int = 1000;
    var saldo: Double = 0.0;
    saldo = 100.00;
    saldo = 0.0;

    println("Titular: $titular");
    println("Conta: $numeroConta | Saldo: $saldo");

    testaConditions(saldo);
    testaLoops();

}

fun testaConditions(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo");
        saldo == 0.0 -> println("Saldo zerado");
        else -> println("Saldo negativo");
    }
}

fun testaLoops() {
    for(i in 1..5) {
        println("Using range: $i");
    }

    for(i in 5 downTo 1) {
        println("Using downTo: $i")
    }

    for(i in 10 downTo 1 step 2) {
        println("Using steps to jump in 2: $i")
    }

    for(i in 10 downTo 1 step 2) {
        println("Using break in the middle of for: $i");
        if(i == 4) {
            break;
        }
    }

    var i = 0;
    while (i <= 5) {
        println("Using while $i")
        i++;
    }
}



