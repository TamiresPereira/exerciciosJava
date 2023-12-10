package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("o pequeno principe");
        livros.add("don quixote");
        livros.push("o hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.remove());

       // livros.size();
       // livros.clear();
       // livros.isEmpty();
    }
}
