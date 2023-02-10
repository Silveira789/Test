package aula02.modelo;

public class Caneta {

    public String cor;
    private String modelo;

    private boolean tampada;
    private float ponta;
    private int carga;


    //Estado
    public void status() {
        System.out.println("STATUS--------------------------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Caneta está tampada?: " + this.tampada);
        System.out.println("---------------------------------------------------");

    }

    //Métodos

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("FATAL ERROR: Caneta está tampada");
        } else {
            System.out.println("Rabiscado com sucesso");
        }

    }

    public void tampar() {
        this.tampada = true;
        //this = nome do obj que chamou --> c1
        // this é um referenciador de atributos
    }

    public void destampar() {
        this.tampada = false;

    }

    //GET e SET

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // CONSTRUTORES

    public Caneta(String cor, String modelo, boolean tampada, float ponta, int carga) {
        this.cor = cor;
        this.modelo = modelo;
        this.tampada = tampada;
        this.ponta = ponta;
        this.carga = carga;
    }


}
