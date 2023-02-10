package aula03.principal;

import aula03.modelo.Exemplo;

public class Principal extends Exemplo {

    public static void main(String[] args) {

        /*
        *
        * + --> public: acesso a todas as classes;
        * - --> private: acesso restrito a propria classe;
        *   --> default: acesso restrito a pacote;
        * # --> protected: processo de extenção (Herança)
        *
        */

        Exemplo exemplo = new Exemplo();
        exemplo.atributoA = 5;
        //exemplo.atributoB = 6;
        //exemplo.atributoD = 8;

        Exemplo2 exemplo2 = new Exemplo2();
        exemplo2.atributoC = 7;


        System.out.println(exemplo.atributoA);

    }


}
