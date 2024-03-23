import java.util.Scanner;

public class TestaAr{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        ArCondicionado ac1 = new ArCondicionado();
        ac1.setNome("Quarto");
        ac1.setTempAtual(23);
        ac1.setTempMax(28);
        ac1.setTempMin(16);

        int op=0;
        do{ System.out.println("------------------------");
            System.out.println("O que você deseja fazer\n" +
                    "0 - Sair\n" +
                    "1 - Ligar o ar-condicionado\n" +
                    "2 - Aumentar a temperatura\n" +
                    "3 - Diminuir a temperatura\n");
            System.out.println("------------------------");

            op = sc.nextInt();
            switch(op){
                case 0:
                    System.out.println("Desligando ar-condicionado...");
                    break;
                case 1:
                    ac1.togglePower();
                    break;
                case 2:
                    System.out.println("qual temp voce deseja?");
                    float tempAumentar = sc.nextInt();
                    ac1.alteraTemp(tempAumentar);
                   break;
                case 3:
                    System.out.println("qual temp voce deseja?");
                    float tempDiminuir = sc.nextInt();
                    ac1.alteraTemp(tempDiminuir);
                    break;
            }
        }while(op!=0);
    }
}