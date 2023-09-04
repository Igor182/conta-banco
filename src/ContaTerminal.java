import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner, os valores digitados no terminal
        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seria seu nome?");
        String nome = scanner.next();
        System.out.println("Qual seria seu número?");
        int numero = scanner.nextInt();
        System.out.println("Qual seria sua agência?");
        int agencia = scanner.nextInt();
        System.out.println("Qual seria seu saldo?");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta:" + numero + ", e seu saldo é de: " + saldo + " R$ já está disponível para saque!");
        
    }
}
