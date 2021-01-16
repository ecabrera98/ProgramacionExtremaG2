package Principal;

import Servicios.Cliente;

public class Pedido {

    public void Carrito() // subprograma para el boton manual
    {
        int i=0,iSiga=0;
        String strEspacio="           ";
        int intNum=0;
        String strAux="";
        String strTextoPantalla="";
        Cliente objPersona = new Cliente();
        RegistrarCliente objCliente = new RegistrarCliente();

        strTextoPantalla = nombre(strTextoPantalla, objPersona, objCliente);

        strTextoPantalla = email(strTextoPantalla, objPersona, objCliente);

        celular(strTextoPantalla, objPersona, objCliente);


        String pedido = envioPedido(objPersona);
        System.out.println (pedido);
        Comprar objPedido = new Comprar(4);
        objPedido.Pedido();


    }

    public String envioPedido(Cliente objPersona) {
        String pedido; // variable de tipo caracter para introducir el contenido de texto del manual
        pedido = "\t\tPedido\t\t\n\n"
                + "Su pedido ha sido enviado con éxito\n"
                + "-  A nombre de:" + objPersona.getNombre() + "\n"
                + "- Adicionalmente se le ha enviado un correo electrónico a " + objPersona.getEmail() +
                "con la información de su Pedido\n" +
                "- Se le llamará al número: " + objPersona.getCelular() + "\n"
                + "para organizar el día de la entrega de su pedido\n"
                + "Gracias por usar Nuestros Servicio\n\n";
        return pedido;
    }

    public void celular(String strTextoPantalla, Cliente objPersona, RegistrarCliente objCliente) {
        String strAux;
        strAux = objCliente.registrarCelular(strTextoPantalla, "Ingrese su Teléfono Celular", "^([0-9])*",
                "El teléfono celular ingresado es inválido",
                10, "El teléfono celular debe ser de 10 caracteres");
        objPersona.setCelular(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
    }

    public String email(String strTextoPantalla, Cliente objPersona, RegistrarCliente objCliente) {
        String strAux;
        strAux = objCliente.registrarEmail(strTextoPantalla, "Ingrese su Correo Electrónico",
                "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",
                "El Correo Electrónico ingresado es inválido", 50, "Ha exedido el tamaño máximo de caracteres");
        objPersona.setEmail(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
        //incializamos la variables a vacio
        strAux="";
        strTextoPantalla ="";
        return strTextoPantalla;
    }

    public String nombre(String strTextoPantalla, Cliente objPersona, RegistrarCliente objCliente) {
        String strAux;
        strAux = objCliente.registrarNombre(strTextoPantalla, "Ingrese su Nombre", "^[a-zñA-ZÑ]+$",
                "Su Nombre tiene caracteres numéricos o especiales",
                15, "El tamaño máximo debe ser de 15 caracteres");
        objPersona.setNombre(strAux);	//llenamos la clase bean con el dato obtenido en el ejecutable
        strAux="";			//inicializamos las variables y los objetos en 0
        strTextoPantalla ="";
        return strTextoPantalla;
    }


}


