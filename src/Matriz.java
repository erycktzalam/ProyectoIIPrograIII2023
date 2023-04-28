package TareaProgramacion;

public class Matriz {

    private Nodo[][] matriz;

    public Matriz(int fila, int columna) {
        this.matriz = new Nodo[fila][columna];
        inicializarMatriz();
    }

    private void inicializarMatriz() {
        int letra = 100;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = new Nodo(new Vehiculo((letra++) + "", "ROJO", "2020", "TOYOTA", "MIRIAM SEBASTIAN"));
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

    public void set(int i, int j, Vehiculo v) {
        Nodo nodo = new Nodo(v);
        matriz[i][j] = nodo;
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

    public Nodo[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Nodo[][] matriz) {
        this.matriz = matriz;
    }

    public String buscar(String dato) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && (matriz[i][j].getVehiculo().getColor().equalsIgnoreCase(dato)
                        || matriz[i][j].getVehiculo().getLinea().equalsIgnoreCase(dato)
                        || matriz[i][j].getVehiculo().getModelo().equalsIgnoreCase(dato)
                        || matriz[i][j].getVehiculo().getPlaca().equalsIgnoreCase(dato)
                        || matriz[i][j].getVehiculo().getPropietario().equalsIgnoreCase(dato))) {
                    return matriz[i][j].getVehiculo().toString();
                }
            }
        }
        return "No encontrado";
    }

    public void eliminar(int fila, int columna) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            System.out.println("La posicion a eliminar es invalida");
            return;
        }

        Nodo nodoEliminar = matriz[fila][columna];
        if (nodoEliminar.getArriba() != null) {
            nodoEliminar.getArriba().setAbajo(nodoEliminar.getAbajo());
        }
        if (nodoEliminar.getAbajo() != null) {
            nodoEliminar.getAbajo().setArriba(nodoEliminar.getArriba());
        }
        if (nodoEliminar.getIzquierda() != null) {
            nodoEliminar.getIzquierda().setDerecha(nodoEliminar.getDerecha());
        }
        if (nodoEliminar.getDerecha() != null) {
            nodoEliminar.getDerecha().setIzquierda(nodoEliminar.getIzquierda());
        }

        matriz[fila][columna] = null;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.print(matriz[i][j].getVehiculo().toString() + " ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
