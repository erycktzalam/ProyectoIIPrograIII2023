package TareaProgramacion;

public class Matriz {

    //matriz de nodos

    private Nodo[][] matriz;
    
    //constructor con parametros de fila y columna para establecer el tamaño

    public Matriz(int fila, int columna) {
        this.matriz = new Nodo[fila][columna];
        inicializarMatriz();
    }
    
    //Incializa la matriz, es decir establece la referencia de cada nodo con sus compañeros, establece el enlace arriba, abajo, derecha e izquierda de cada nodo de la matriz

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
    
    //metodo para insertar un vehiculo en la matriz, se debe indicar la posicion en la que se quiere insertar y los datos del vehiculo

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
    
    //metodos set and get de la matriz

    public Nodo[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Nodo[][] matriz) {
        this.matriz = matriz;
    }

    //metodo de busqueda que recibe como parametro una cadena y esta cadena se compara con los datos del vehiculo para encontar coincidencias y luego imprimir esos datos.
    //Si no se encuentra el dato se imprime el mensaje "No encontrado"
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
    
    //Metodo que elimina un nodo en la matriz, se debe enviar como parametro la posicino de la matriz que se quiere eliminar, se recorre la matriz para encontrar el dato.
    //Se valida que la posicion ingresada sea valida.
    //Si se encuentra la posicion se apuntan los enlaces a sus nuevas referencias y luego se coloca como null la posicion para eliminar los datos del nodo.

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
    
    //Se recorre la matriz y se obtienen los datos de los vehiculos y se imprimen en consola.

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
