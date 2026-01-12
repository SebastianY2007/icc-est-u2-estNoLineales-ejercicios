package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    public int calcular(Node root) {
        if (root == null) return 0;

        int izquierda = calcular(root.getLeft());
        int derecha = calcular(root.getRight());
        
        int result = Math.max(izquierda, derecha) + 1;
        return result;
    }
}
