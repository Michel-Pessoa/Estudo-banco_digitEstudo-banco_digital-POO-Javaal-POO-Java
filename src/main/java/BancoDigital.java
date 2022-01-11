
public class BancoDigital {

    public static void main(String[] args) throws Exception {
        Cliente michel = new Cliente();
        michel.setNome("Michel");

        Conta cc = new ContaCorrente(michel);
        Conta poupanca = new ContaPoupanca(michel);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.transferir(101, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
