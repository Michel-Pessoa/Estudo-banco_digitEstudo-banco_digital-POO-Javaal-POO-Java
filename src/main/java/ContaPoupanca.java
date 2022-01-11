
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void sacar(double valor){
        if (saldo - valor >= 0) {
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente para a transação.");
            imprimirExtrato();
            System.exit(0);
        }
    }
}
