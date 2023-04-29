public class Vehiculo {

    private String placa;
    private String color;
    private String linea;
    private String modelo;
    private String propietario;

    //constructor sin parametros
    
    public Vehiculo() {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }
    
    //constructor con parametros
    
    public Vehiculo(String placa, String color, String linea, String modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }
    
    //metodos setters and getters
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    //metodo toString que imprime los datos del vehiculo

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(placa);
//        sb.append(", color=").append(color);
//        sb.append(", linea=").append(linea);
//        sb.append(", modelo=").append(modelo);
//        sb.append(", propietario=").append(propietario);
//        sb.append('}');
        return sb.toString();
    }
}
