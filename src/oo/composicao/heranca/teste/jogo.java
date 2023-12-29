package oo.composicao.heranca.teste;

import oo.composicao.heranca.Direcao;
import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

public class jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("o mostro tem" + monstro.vida);
        System.out.println("o heroi tem " + heroi.vida);
    }
}
