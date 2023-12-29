package oo.composicao.heranca.Desafio;

public class Carro {

    final int velocidade_maxima;

    int velocidadeAtual;

    int delta = 5;

    Carro(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > this.velocidade_maxima) {
            velocidadeAtual = this.velocidade_maxima;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
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