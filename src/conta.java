public class conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    private static final int AGENCIAPADRAO = 1;
    private static int SEQUENCIAL = 1; // todo metodo que tiver "static" significa algo permanente,no caso a sequencia começa em 0

    public conta(cliente cliente){
        this.agencia = conta.AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;  // se refere a o id da conta, cada vez q criar a conta some +1 para a proxima ser o id 2;
        this.cliente = cliente;

    }



    public void Sacar(double valor){
            saldo -= valor;

    }
    public void depositar(double valor){
            saldo += valor;

    }
    public void transferir(double valor,conta destino){
        this.Sacar(valor);    // do usuario que estiver usando o transferir, use o metodo saque
        destino.depositar(valor); // e para destino que recebe a transferencia , use o metodo depositar na conta destino

    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
    public void ImprimirExtrato(){
        System.out.println("============Extrato=============");
        System.out.println(String.format("Titular: %s",cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d",agencia));
        System.out.println(String.format("numero: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }
}
