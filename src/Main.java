package TareaProgramacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(4, 4);
        Scanner input = new Scanner(System.in);
        int opcion;
         
        do {
           System.out.println("===== MENU =====");
           System.out.println("1. Eliminar 1");
           System.out.println("2. Buscar 2");
           System.out.println("3. Insertar 3");
           System.out.println("4. Salir");
           System.out.print("Ingrese una opción: ");
           opcion = input.nextInt();
           
           switch (opcion) {
            case 1:
               System.out.println("Ha seleccionado la opción 1");
               matriz.imprimirMatriz();
               System.out.println("Eliminando la posicion [1][1]");
               matriz.eliminar(1, 1);
               System.out.println("Eliminando la posicion [3][4]");
               matriz.eliminar(3, 4);
               System.out.println("\n");
               matriz.imprimirMatriz();
               break;
               
            case 2:
               System.out.println("Ha seleccionado la opción 2");
               
              System.out.println("Buscando ABC109");
              System.out.println(matriz.buscar("ABC109"));
              System.out.println("Buscando AAA750");
              System.out.println(matriz.buscar("AAA7503"));
               break;
            case 3:
               System.out.println("Ha seleccionado la opción 3");
               System.out.println("Agregando AAA750 en la posicion [1][1]");
               matriz.set(1, 1, new Vehiculo("AAA750", "BBB200", "BBB200", "BBB200", "BBB200"));
               matriz.imprimirMatriz();
               break;
               
            case 4:
               System.out.println("Adios!");
               break;
            default:
               System.out.println("Opción no válida");
               break;
            }
        } while (opcion != 4);
        
    }
}
