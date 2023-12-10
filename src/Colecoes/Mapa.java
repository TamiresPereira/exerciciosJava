package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Heloisa");
        usuarios.put(2, "Sonia");
        usuarios.put(3, "Edson");
        usuarios.put(4, "Renan");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.values());

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

    }
}
