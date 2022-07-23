import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Digite a coordenada x: ");
        x = sc.nextInt();
        System.out.println("Digite a coordenada y: ");
        y = sc.nextInt();

        while ((x != 0) && (y != 0)){
            if(x > 0 && y > 0){
                System.out.println("A coordenada pertence ao primeiro quadrante!");
            }else if (x > 0 && y < 0){
                System.out.println("A coordenada pertence ao segundo quadrante!");
            }else if (x < 0 && y < 0){
                System.out.println("A coordenada pertence ao terceiro quadrante!");
            }else{
                System.out.println("A coordenada pertence ao quarto quadrante!");
            }
            System.out.println("");
            System.out.println("Digite a coordenada x: ");
            x = sc.nextInt();
            System.out.println("Digite a coordenada y: ");
            y = sc.nextInt();
        }
        System.out.println("Programa finalizado!");
    }
}
