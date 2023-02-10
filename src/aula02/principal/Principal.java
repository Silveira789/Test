package aula02.principal;

import aula02.modelo.Caneta;

public class Principal {

    public static void main(String[] args) {

        Caneta c1 = new Caneta(); // --> c1= Nova Caneta



        /* Diferença Básica --> Utilização GET/SET
        *
        * Utilizado para privatizar variáveis chamando-as apenas quando solicitar
        *
        * Ex: c1.setCor("vermelha");
        *
        * Caso a variavel fosse publica (Sem GET/SET)
        * Ex: c1.cor = "vermelha";
        *
        * */

        c1.cor = "vermelha";
        //c1.setTampada(true);
        c1.setPonta(0.5f);
        c1.setCarga(0);
        c1.setModelo(null);
        c1.destampar();

        //------------------------------
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.setCor("preta");
        c2.setCarga(1);
        c2.setModelo(null);
        c2.setTampada(false);




    }
}
