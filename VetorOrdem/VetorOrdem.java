package VetorOrdem;

import java.util.Scanner;

public class VetorOrdem {
	public static void main(String[] args){
                Scanner entrada = new Scanner(System.in);
                int tam;
                System.out.println("Digite o tamanho do vetor");
                tam = entrada.nextInt();

                int vetor[] = new int[tam];

                System.out.println("digite os valores do vetor:");
                for(int i=0; i<tam; i++){
                        vetor[i] = entrada.nextInt();
                }

                System.out.println("vetor obtido:");
                for(int i=0; i<tam; i++){
                System.out.println(vetor[i]);
                }

                int num1, num2, count=0;
                for(int i=0; i<tam-1; i++){
                        num1 = vetor[i];
                        num2 = vetor[i+1];
                        if(num1<num2) count++;       
                }

                if(count == tam-1) System.out.println("o vetor esta em ordem");
                else System.out.println("o vetor nao esta em ordem");
        }
	}



