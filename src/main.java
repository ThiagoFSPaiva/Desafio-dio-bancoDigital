import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String nome; // variavel para entrada do usuario

        Scanner scan = new Scanner(System.in);
        cliente cliente = new cliente(); // criando um cliente novo



        nome = scan.next();  // a variavel nome recebe o titular da conta

        cliente.setNomeCliente(nome); // E aqui eu seto no metodo o titular da conta



        conta corrente1 = new contaCorrente(cliente); // Criei nova contaCorrente recebendo o nome do cliente
        conta poupance = new contaPoupanca(cliente); // Criei nova contaPoupanca recebendo o mesmo cliente, no caso abrir 2 contas no msm nome dele


        //testes

        poupance.depositar(254.12); //Estou depositando esse valor na conta poupança que criei


        poupance.transferir(100,corrente1); //E aqui agora estou transferindo esse valor da poupança para a conta corrente que criei


        corrente1.ImprimirExtrato(); // Agora vou imprimir o extrato da conta que escolhi
        poupance.ImprimirExtrato();
    }
}
