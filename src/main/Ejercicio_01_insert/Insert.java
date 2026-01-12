package main.Ejercicio_01_insert;

import java.util.LinkedList;
import java.util.Queue;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;

public class Insert {

    public ArbolBinario ejecutar(int[] valores) {
        ArbolBinario arbol = new ArbolBinario();
        for (int v : valores) {
            arbol.insert(v);
        }
        return arbol;
    }

    public void imprimirPorNiveles(Node root) {
        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int size = cola.size();
            for (int i = 0; i < size; i++) {
                Node actual = cola.poll();
                System.out.print(actual.getValue());

                if (i < size - 1) System.out.print(" ");

                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            System.out.println();
        }
    }
}
 