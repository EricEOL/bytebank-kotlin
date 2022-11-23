fun main() {
    println("Welcome to ByteBank");
    testaCopiasEReferencias();
}

class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo: Double = 0.0
        private set

    /*
    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }
    */

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) this.saldo -= valor;
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    /*
    fun getSaldo(): Double {
        return this.saldo;
    }

    fun setSaldo(valor: Double) {
        if(valor > 0) {
            this.saldo = saldo;
        }
    }*/
}

fun testaFuncoes() {
    val contaJoao = Conta("João", 10001);
    var contaMaria = Conta("Maria", 1002);

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println("Depositando conta João")
    contaJoao.deposita(1000.0);
    println("Saldo: ${contaJoao.saldo}");

    println("Depositando conta João - COM FUNÇÃO DEPOSITA")
    contaJoao.deposita(2000.0);
    println("Saldo: ${contaJoao.saldo}");

    println("Sacando conta João - COM FUNÇÃO SAQUE")
    contaJoao.saca(1200.0);
    println("Saldo: ${contaJoao.saldo}");

    println("Transferindo conta João para conta Maria - COM FUNÇÃO TRANSFERE")
    if (contaJoao.transfere(contaMaria, 1600.0)) {
        println("Transferência realizada.");
    } else {
        println("Transferência falhou.");
    }
    println("Saldo João: ${contaJoao.saldo}");
    println("Saldo Maria: ${contaMaria.saldo}");
}

fun testaCopiasEReferencias() {
    val conta = Conta("Eric", 1000);
    conta.deposita(1000.0);
    println("Conta 1: ${conta.titular}");

    val contaDaRebecca = Conta("Rebecca", 3000);
    contaDaRebecca.deposita(1000000.0);
    println("Conta 2 ${contaDaRebecca.titular}")

    val numeroX = 10;
    var numeroY = numeroX;
    numeroY++;

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1001);
    var contaMaria = Conta("Maria", 1002);

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
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
    for (i in 1..5) {
        println("Using range: $i");
    }

    for (i in 5 downTo 1) {
        println("Using downTo: $i")
    }

    for (i in 10 downTo 1 step 2) {
        println("Using steps to jump in 2: $i")
    }

    for (i in 10 downTo 1 step 2) {
        println("Using break in the middle of for: $i");
        if (i == 4) {
            break;
        }
    }

    var i = 0;
    while (i <= 5) {
        println("Using while $i")
        i++;
    }
}



