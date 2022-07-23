import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 2002){
            System.out.println("Senha inválida!");
            System.out.println("Digite a senha:");
            senha = sc.nextInt();


        }
        System.out.println("Acesso permitido!");
    }
}
