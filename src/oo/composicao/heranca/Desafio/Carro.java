package oo.composicao.heranca.Desafio;

public class Carro {

    public final int velocidade_maxima;

   protected int velocidadeAtual;

  private int delta = 5;

   protected Carro(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > this.velocidade_maxima) {
            velocidadeAtual = this.velocidade_maxima;
        } else {
            velocidadeAtual += getDelta();
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}