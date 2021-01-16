package Servicios;

public class Cliente {
    private String Celular="";
    private String Nombre="";;
    private String Apellido="";
    private String Email="";
    private String Espacios="                                                                   ";


    public String getNombre() {

        return Nombre;
    }
    public void setNombre(String strNombre) {
        this.Nombre = strNombre;
    }


    public String getApellido() {
        return Apellido;

    }
    public void setApellido(String strApellido) {
        this.Apellido = strApellido;
    }


    public String getEmail() {

        return Email;
    }
    public void setEmail(String strEmail) {
        this.Email = strEmail;
    }



    public String getCelular() {
        return Celular;
    }
    public void setCelular(String strCelular) {
        this.Celular = strCelular;
    }


    public String toString() {
        return  Nombre+Espacios.substring(0,15-Nombre.length())+
                Apellido+Espacios.substring(0,15-Apellido.length())+
                Email+Espacios.substring(0,30-Email.length())+
                Celular+Espacios.substring(0,15-Celular.length())+Espacios.substring(0,5);
    }

}

