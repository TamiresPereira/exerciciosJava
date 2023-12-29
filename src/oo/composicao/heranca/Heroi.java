package oo.composicao.heranca;

public class Heroi extends jogador{

   public Heroi(int x, int y){
        super(x, y);
    }

    @Override
    public boolean atacar(jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
