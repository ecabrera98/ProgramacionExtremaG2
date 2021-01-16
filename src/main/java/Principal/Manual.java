package Principal;

public class Manual {

    public void Manual() // subprograma para el boton manual
    {
        manualusuario();
    }

    private void manualusuario() {
        String manual; // variable de tipo caracter para introducir el contenido de texto del manual
        manual = "\t\tMANUAL DE USUARIO\t\t\n\n"
                + "Este programa proyecta el funcionamiento de un centro comercial online\n"
                + "- Para registrarse presione el botón REGISTRAR CLIENTE\n"
                + "- Para informarse sobre el uso del programa presione el botón Manual\n"
                + "- Para Salir del programa completo puede hacer click al botón  Salir o en la X roja\n\n"
                + "Iniciando:\n\n";

        System.out.println (manual);
    }


}

