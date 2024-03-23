public class ArCondicionado {
    private String nome;
    private float tempMin;
    private float tempMax;
    private float tempAtual;
    private boolean power = false;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempAtual(float tempAtual) {
        this.tempAtual = tempAtual;
    }

    public float getTempAtual() {
        return tempAtual;
    }

    public void togglePower() {
        this.power = !this.power;

        if (this.power) {
            System.out.println("Ar condicionado ligado. \n");
            System.out.println("Temperatura Máxima: " + tempMax);
            System.out.println("Temperatura Mínima: " + tempMin);
            System.out.println("Temperatura atual: " + tempAtual + "\n");


        } else {
            System.out.println("Ar condicionado já estava ligado\n");
        }
    }

    public void alteraTemp(float tempDesejada) {
        
        if (tempDesejada == tempAtual) {
            System.out.println("Esta já é a temperatura atual.\n");
        }

        else if(tempDesejada > tempMax){
            System.out.println("Essa temperatura é maior que a suportada");
        }

        else if(tempDesejada < tempMin){
            System.out.println("Essa temperatura é menor que a suportada");

        } 

        else if (tempDesejada < tempAtual) {
            while (tempDesejada != tempAtual) {
                tempAtual -= 0.5;
                System.out.println("Temperatura atual: " + tempAtual);
            }
        }
        
        else if (tempDesejada > tempAtual) {
            while (tempDesejada != tempAtual) {
                tempAtual += 0.5;
                System.out.println("Temperatura atual: " + tempAtual);
            }
        }
    }
}