package oo.composicao.heranca;

public class jogador {

    int vida = 100;
    int x;
    int y;

    jogador(){
        this(0, 0);
    }

    jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean atacar(jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs (y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        }else if (deltaX == 1 && deltaY == 0){
            oponente.vida -= 20;
            return true;
        }else {
            return false;
        }

    }
    boolean andar(Direcao direcao){
        switch (direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
             x++;
            break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
    }
        return true;
    }
}
