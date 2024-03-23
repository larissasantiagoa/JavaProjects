/*Você irá criar uma solução de software para controlar os votos de urnas eletrônicas. A eleição irá iniciar com uma lista de candidatos que possuem nome, número e cargo ao qual irão pleitear. De posse dos dados dos candidatos, as urnas eletrônicas serão preparadas, recebendo a lista de cada candidato e zerando os seus respectivos contadores de votos. A urna deverá ter um método votar, que irá receber um objeto do tipo candidato e irá incrementar o contador de votos correspondente. 


Ao final do processo, calcule o o resultado da eleição, informando o número total de votos de cada candidato, apurando todas as urnas.*/
import java.util.Scanner;

public class Eleicoes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Candidatos c1 = new Candidatos();
        Candidatos c2 = new Candidatos();
        Candidatos c3 = new Candidatos();

        
    c1.setNome("Larissa");
    c1.setCargo("Prefeito");
    c1.setNumero(1);

    c2.setNome("Marcelo");
    c2.setCargo("Prefeito");
    c2.setNumero(2);

    c3.setNome("Ulisses");
    c3.setCargo("Prefeito");
    c3.setNumero(3);

    //Criando uma instância da classe 'Urna'
    // 'u' é a variável que aponta para a instância
    //'new' é usado para alocar a memória e inicializar um objeto
    //'new Urna()' cria um objeto tipo 'Urna' que retorna uma referência para esse objeto

    Urna u = new Urna();
    u.preparaUrna(new Candidatos[]{c1, c2, c3});
  
  
    int op;
    do{
        System.out.println("Selecione a opcao desejada:\n 1-Votar\n 2-Ver resultados");
        op = sc.nextInt();
       
        switch (op) {
            case 1:
                u.votar();
                break;
            case 2:
                u.resultado();
                break;
            default:
                System.out.println("invalido");
                break;
        }

        System.out.println("Aperte 0 para encerrar o programa ou outra tecla para continuar");
        op = sc.nextInt();
        
    }while(op!=0);

    }
}