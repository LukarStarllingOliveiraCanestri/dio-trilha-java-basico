
import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public Float saldo;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuáro

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        Float saldoConta = scanner.nextFloat();

        ContaTerminal conta = new ContaTerminal();
        conta.numero = numeroConta;
        conta.agencia = agencia;
        conta.nomeCliente = nomeCliente;
        conta.saldo = saldoConta;

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");
    

    }
}
