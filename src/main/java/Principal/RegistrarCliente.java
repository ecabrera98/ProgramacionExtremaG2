package Principal;

import  Servicios.Cliente;

import javax.swing.*;
import java.util.regex.Pattern;

public class RegistrarCliente{

    private Cliente prueba=new Cliente();
    public static int []clients = new int[5];
    public RegistrarCliente(){
        System.out.println (prueba);
    }


    public void Clientes()
    {

        Cliente objPersona = new Cliente();
        int i=0,iSiga=0;
        String strEspacio="           ";
        int intNum=0;
        String strAux="";
        String strTextoPantalla="";
        boolean bln=false;


        System.out.println("Nombre"+strEspacio.substring(0,8)+"Apellido"+strEspacio.substring(0,8)
                +"Correo Electrónico"+strEspacio.substring(0,8)+"Teléfono Celular");

        while(bln==false){
            //validacion del parametro apellido que no sea mayor a 15 caracteres y que solo deje usar letras


            strAux = registrarNombre(strTextoPantalla, "Ingrese su Nombre", "^[a-zñA-ZÑ]+$", "Su Nombre tiene caracteres numéricos o especiales",
                    15, "El tamaño máximo debe ser de 15 caracteres");
            objPersona.setNombre(strAux);	//llenamos la clase bean con el dato obtenido en el ejecutable
            strAux="";			//inicializamos las variables y los objetos en 0
            strTextoPantalla="";


            strAux = registrarApellido(strTextoPantalla, "Ingrese su Apellido", "^[a-zñA-ZÑ]+$", "Su Apellido tiene caracteres numéricos o especiales",
                    15, "El tamaño máximo debe ser de 15 caracteres");
            objPersona.setApellido(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
            //incializamos la variables a vacio
            strAux="";
            strTextoPantalla="";


            strAux = registrarEmail(strTextoPantalla, "Ingrese su Correo Electrónico", "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",
                    "El Correo Electrónico ingresado es inválido", 50,
                    "Ha exedido el tamaño máximo de caracteres");
            objPersona.setEmail(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
            //incializamos la variables a vacio
            strAux="";
            strTextoPantalla="";


            strAux = registrarCelular(strTextoPantalla, "Ingrese su Teléfono Celular", "^([0-9])*", "El teléfono celular ingresado es inválido",
                    10, "El teléfono celular debe ser de 10 caracteres");
            objPersona.setCelular(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable


            objPersona.setCelular(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
            //inicializamos las variables a vacio
            strAux="";
            strTextoPantalla="";


            //obtenemos el dato de la clase bean mediante el metodo get
            objPersona.getNombre();
            objPersona.getApellido();
            objPersona.getEmail();
            objPersona.getCelular();

            System.out.print(objPersona);		//mostramos en consola el arreglo generado en la clase bean mediante el metodo tostring
            System.out.println("");


            // caja de confirmación para que el usuario decida si quiere más operaciones.
            iSiga=JOptionPane.showConfirmDialog(null, "Confirme si desea ingresar nuevos datos");
            if (iSiga!=0)
            {
                System.out.println("\n\nClientes Ingresados Exitosamente");
                bln = true;;// finaliza la aplicacion con la ventana

            }
        }

    }


    public String registrarCelular(String strTextoPantalla, String s, String s2, String s3, int i2, String s4) {
        String strAux;
        boolean blnchitory;
        do {
            strAux = JOptionPane.showInputDialog(s, strTextoPantalla); //pedimos al usuario que ingrese su teléfono celular
            blnchitory = true;
            if (!Pattern.matches(s2, strAux)) {//condición para identificar si contiene caracteres no permitidos
                JOptionPane.showMessageDialog(null, s3, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            } else if (strAux.length() < i2 || strAux.length() > i2) {
                JOptionPane.showMessageDialog(null, s4, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            }

        } while (blnchitory == false);
        return strAux;
    }

    public String registrarEmail(String strTextoPantalla, String s, String s2, String s3, int i2, String s4) {
        String strAux;
        boolean blnchitory;
        do {
            strAux = JOptionPane.showInputDialog(s, strTextoPantalla); //pedimos al usuario que ingrese su correo electrónico
            blnchitory = true;
            if (!Pattern.matches(s2, strAux)) {//condición para identificar si contiene caracteres no permitidos
                JOptionPane.showMessageDialog(null, s3, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            } else if (strAux.length() > i2) {
                JOptionPane.showMessageDialog(null, s4, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            }

        } while (blnchitory == false);
        return strAux;
    }

    public String registrarApellido(String strTextoPantalla, String s, String s2, String s3, int i2, String s4) {
        String strAux;
        boolean blnchitory;
        do {
            strAux = JOptionPane.showInputDialog(s, strTextoPantalla); //pedimos al usuario que ingrese su apellido
            blnchitory = true;
            if (!Pattern.matches(s2, strAux)) {//condición para identificar si contiene caracteres no permitidos
                JOptionPane.showMessageDialog(null, s3, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            } else if (strAux.length() > i2) {
                JOptionPane.showMessageDialog(null, s4, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            }

        } while (blnchitory == false);
        return strAux;
    }

    public String registrarNombre(String strTextoPantalla, String s, String s2, String s3, int i2, String s4) {
        String strAux;
        boolean blnchitory;
        do {
            strAux = JOptionPane.showInputDialog(s, strTextoPantalla); //pedimos al usuario que ingrese su nombre
            blnchitory = true;
            if (!Pattern.matches(s2, strAux)) {//condición para identificar si contiene caracteres permitidos
                JOptionPane.showMessageDialog(null, s3, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            } else if (strAux.length() > i2) {
                JOptionPane.showMessageDialog(null, s4, "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                blnchitory = false;
                strTextoPantalla = strAux;
            }

        } while (blnchitory == false);
        return strAux;
    }


}
