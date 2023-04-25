import java.util.Arrays;

public class Matriz {

    private Nodo[][] matriz;

    public Matriz(int fila, int columna) {
        this.matriz = new Nodo[fila][columna];
        inicializarMatriz();
    }

    private void inicializarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = new Nodo(new Vehiculo("ABC123","ROJO","2020","TOYOTA","ERICK TZALAM"));
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Nodo nodo = matriz[i][j];
                if (i > 0) {
                    nodo.setArriba(matriz[i - 1][j]);
                }
                if (i < matriz.length - 1) {
                    nodo.setAbajo(matriz[i + 1][j]);
                }
                if (j > 0) {
                    nodo.setIzquierda(matriz[i][j - 1]);
                }
                if (j < matriz.length - 1) {
                    nodo.setDerecha(matriz[i][j + 1]);
                }
            }
        }
    }

    public Nodo[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Nodo[][] matriz) {
        this.matriz = matriz;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j].getVehiculo().toString() + " ");
            }
            System.out.println();
        }
    }
}
