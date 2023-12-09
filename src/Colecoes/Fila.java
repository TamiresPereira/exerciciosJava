package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //offer e add adicionam elementos na fila
        //diferença é o comportamento quando a fila esta cheia
        fila.add("ana"); //retorna falso quando ta cheio
        fila.offer("bia"); // lança uma exceção quando tá cheio
        fila.offer("carlos");
        fila.offer("daniel");
        fila.offer("rafaela");
        fila.offer("gui");

        //peek e elemente ontem o proximo elemento da fila sem remover
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

        //poll e remove obtem o proximo elemento e remove ele
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // lança uma exceção
    }
}
