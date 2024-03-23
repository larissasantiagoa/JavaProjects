import java.util.Scanner;

public class Urna {

    Scanner sc = new Scanner(System.in);
    private Candidatos[] candidatos;
    private int[] resultados;

    public Urna() {
        this.candidatos = null;
        this.resultados = null;
    }

    public void setCandidatos(Candidatos[] candidatos) {
        this.candidatos = candidatos;
    }

    public Candidatos[] getCandidatos() {
        return this.candidatos;
    }

    public void setResultados(int[] resultados) {
        this.resultados = resultados;
    }

    public int[] getResultados() {
        return this.resultados;
    }

    public void votar() {
        int votacao;
        System.out.println("Candidatos:\n 1-Bloch\n 2-Capezio\n 3-So danca");
        votacao = sc.nextInt();

        for(int i=0; i<this.candidatos.length; i++){
            if(votacao == this.candidatos[i].getNumero()){
                this.resultados[i]++;
            }
        }
    }

    public void resultado() {
        System.out.println("\nNome\t\tVotos");
        System.out.println("----------------------------");
        
        for (int i = 0; i < this.candidatos.length; i++) {
            System.out.printf(this.candidatos[i].getNome() + "\t" + this.resultados[i] + "\n");
        }
    }

    public void preparaUrna(Candidatos[] candidatos) {
        if (candidatos != null && candidatos.length > 0) {
            this.candidatos = candidatos;
            this.resultados = new int[candidatos.length];
    
            for (int i = 0; i < candidatos.length; this.resultados[i++] = 0);
        }
    }
    
}