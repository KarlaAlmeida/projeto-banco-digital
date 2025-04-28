public interface IConta {

    //Um interface nada mais é do que uma classe abstrata com todos os métodos abstrados.
    //Classe abstrata tem como característica solicitar alguma implementação que ela sozinha não consegue resolver.
    //Classe abstrata não pode ser instanciada.

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

}
