//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Kauan");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);


        cc.depositar(1000);
        cc.transferir(100, poupanca);
        cc.credito(300);
        cc.creditoDisponivel(2000);
        poupanca.sacar(50.5);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
