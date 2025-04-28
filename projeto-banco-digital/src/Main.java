public class Main {
    public static void main(String[] args) throws Exception {
        Cliente karla = new Cliente();
		karla.setNome("Karla");
		
		Conta cc = new ContaCorrente(karla);
		Conta poupanca = new ContaPoupanca(karla);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
