public class ContaBancaria {
    private double saldo;

    // Construtor que inicializa o saldo
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial > 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    // Método para retornar o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para retirar um valor da conta
    public void retirar(double valor) {
        if (verificarSaldoSuficiente(valor)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Método privado para verificar se há saldo suficiente
    private boolean verificarSaldoSuficiente(double valor) {
        return valor <= saldo;
    }
}

