import java.util.Scanner;

public class Exercicio3While {

    public static void main(String[] args) {
        Posto lposto = new Posto();
        int escolha;

        do {
           escolha = menu();

           switch (escolha){
               case 1:
                   System.out.println("Acool selecionado!");
                   lposto.addAlcool();
                   break;
               case 2:
                   System.out.println("Gasolina selecionado!");
                   lposto.addGasolina();
                   break;
               case 3:
                   System.out.println("Diesel selecionado!");
                   lposto.addDiesel();
                   break;
           }


        }while (escolha != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+lposto.getAlcool());
        System.out.println("Gasolina: "+lposto.getGasolina());
        System.out.println("Diesel: "+lposto.getDiesel());
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada!");
            System.out.println("1 - Álcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Fim");
            opcao = sc.nextInt();
        }while (opcao < 1 || opcao > 4);
        return opcao;
    }

}
