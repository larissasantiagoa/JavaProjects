package MatrizQ;

import java.util.Scanner;
import java.util.Random;

public class MatrizQ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        System.out.println("Digite a quantidade de linhas e colunas da matriz");
        x = entrada.nextInt();
        y = entrada.nextInt();

        int matriz[][] = new int[x][y];
        Random random = new Random();

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("matriz gerada:");
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        if(x==y){
            System.out.println("digagonal principal:");

            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    if(i==j) System.out.print(matriz[i][j] + " ");
                    else System.out.print(" " + " ");
                }
                System.out.println();
            }
    
        }
        
       /* 
       int transposta[][] = new int[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                transposta[j][i] = matriz[i][j];
            }
        }*/ 

        System.out.println("matriz transposta:");
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

    }
}

