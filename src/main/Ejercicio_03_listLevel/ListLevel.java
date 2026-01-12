package main.Ejercicio_03_listLevel;

import java.util.*;
import main.Materia.Models.Node;

public class ListLevel {
    public List<LinkedList<Integer>> obtenerListas(Node root) {
        List<LinkedList<Integer>> resultado = new ArrayList<>();
        if (root == null) return resultado;

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int size = cola.size();
            LinkedList<Integer> nivel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node actual = cola.poll();
                nivel.add(actual.getValue());

                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            resultado.add(nivel);
        }
        return resultado;
    }

    public void imprimir(List<LinkedList<Integer>> niveles) {
        for (LinkedList<Integer> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i));
                if (i < nivel.size() - 1) System.out.print(" -> ");
            }
            System.out.println();
        }
    }
}
