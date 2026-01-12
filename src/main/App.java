package main;

import main.Materia.Models.Node;

import java.util.LinkedList;
import java.util.List;

import main.Ejercicio_01_insert.Insert;
import main.Ejercicio_02_invert.Invert;
import main.Ejercicio_03_listLevel.ListLevel;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolBinario;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        System.out.println("===== Ejercicio 1 =====");
        Insert insert = new Insert();
        ArbolBinario arbol = insert.ejecutar(valores);
        insert.imprimirPorNiveles(arbol.getRoot());

        System.out.println("===== Ejercicio 2 =====");
        Invert invert = new Invert();
        Node invertido = invert.invertir(arbol.getRoot());
        insert.imprimirPorNiveles(invertido);

        System.out.println("===== Ejercicio 3 =====");
        ListLevel listLevel = new ListLevel();
        List<LinkedList<Integer>> niveles = listLevel.obtenerListas(arbol.getRoot());
        listLevel.imprimir(niveles);

        System.out.println("===== Ejercicio 4 =====");
        Depth depth = new Depth();
        System.out.println(depth.calcular(arbol.getRoot()));
    }

}
