package oo.composicao;

public class Motor {

    public Carro carro;
    double fatorInjecao = 1;
    boolean ligado = false;

    Motor (Carro carro) {
        this.carro = carro;
    }

    public int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);

        }

    }
}