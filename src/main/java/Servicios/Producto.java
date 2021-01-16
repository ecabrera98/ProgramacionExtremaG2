package Servicios;

public class Producto {
    private String Nombre="";;
    private String Precio="";

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String strnombre) {
        Nombre = strnombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String srtprecio) {
        Precio = srtprecio;
    }


    @Override
    public String toString() {
        return  Nombre +"\t\t\t" + Precio ;
    }
}
