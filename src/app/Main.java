package app;

import entities.Client;

public class Main {

    public static void main(String[] args) {
        
        Client c1 = new Client("Joao", "joao@email.com");
        Client c2 = new Client("Alex", "joao@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        // a comparação a ser feita será pelo espaço alocado em memoria
        System.out.println(c1 == c2);
    }
}