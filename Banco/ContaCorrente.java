class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double limite) {
        super(titular);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado na conta corrente de " + titular);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta corrente de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta corrente de " + titular);
        }
    }
}
