import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência:");
        agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente:");
        nome = sc.nextLine();

        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque");

        sc.close();
    }
}