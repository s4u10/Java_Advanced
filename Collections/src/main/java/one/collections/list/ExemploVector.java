package one.collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] arg) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Jiu-Jitsu");

        System.out.println(esportes);

        // Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        // Remove o esporte da posição 2
        esportes.remove(2);

        // Remove o esporte Basquetebol do vetor
        esportes.remove("Basquetebol");

        System.out.println(esportes);

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Navega no sesportes

        for (String esporte : esportes) {
            System.out.println(esporte);
        }
    }
}
