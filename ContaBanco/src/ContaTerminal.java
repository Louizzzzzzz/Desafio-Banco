import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de sua conta");
        int numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Insira o número de sua agência");
        String agencia = sc.nextLine();

        System.out.println("Insira o seu nome");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira o valor de seu saldo");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
