public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João", 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria");

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);

        contaPoupanca.depositar(150);
        contaPoupanca.sacar(50);
        
        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Poupança: R$ " + contaPoupanca.getSaldo());
    }
}
