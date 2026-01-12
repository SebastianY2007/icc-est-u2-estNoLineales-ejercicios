package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class Invert {
    public Node invertir(Node root) {
        if (root == null) return null;

        Node izquierdo = invertir(root.getLeft());
        Node derecho = invertir(root.getRight());

        root.setLeft(derecho);
        root.setRight(izquierdo);

        return root;
    }
} 
