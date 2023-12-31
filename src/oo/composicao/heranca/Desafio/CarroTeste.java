package oo.composicao.heranca.Desafio;

public class CarroTeste {

    public static void main(String[] args) {
        Gol c1 = new Gol();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();

        System.out.println(c2.velocidadeDoAr());

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);
    }
}
