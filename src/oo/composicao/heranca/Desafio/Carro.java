package oo.composicao.heranca.Desafio;

public class Carro {

    public final int velocidade_maxima;

   protected int velocidadeAtual;

   protected int delta = 5;

   protected Carro(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > this.velocidade_maxima) {
            velocidadeAtual = this.velocidade_maxima;
        } else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "velocidade atual é" + velocidadeAtual + "km/h";
    }

}