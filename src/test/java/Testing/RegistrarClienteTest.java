package Testing;

import Servicios.Cliente;
import Principal.RegistrarCliente;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrarClienteTest {
    private Cliente objPersona;
    private RegistrarCliente objCliente;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        objPersona = new Cliente();
        objCliente = new RegistrarCliente();
    }

    @Test
    public void given_namecliente_when_name_then_ok(){
        String strAux="Edison";
        System.out.println("Test 1");
        assertNotNull("Edison",objCliente.registrarNombre(strAux, "Ingrese su Nombre",
                "^[a-zñA-ZÑ]+$", "Su Nombre tiene caracteres numéricos o especiales",
                15, "El tamaño máximo debe ser de 15 caracteres"));
    }

    @Test
    public void given_celularcliente_when_celular_not_same(){
        String strAux="0998383722";
        System.out.println("Test 2");
        assertNotSame("0979025335",objCliente.registrarCelular(strAux,"Ingrese su Teléfono Celular",
                "^([0-9])*", "El teléfono celular ingresado es inválido",
                10, "El teléfono celular debe ser de 10 caracteres"));
    }


    @Test
    public void given_apellidocliente_when_apellido_then_ok(){
        String strAux="Taco";
        System.out.println("Test 3");
        assertSame("Cabrera",objCliente.registrarNombre(strAux, "Ingrese su Apellido",
                "^[a-zñA-ZÑ]+$", "Su Nombre tiene caracteres numéricos o especiales",
                15, "El tamaño máximo debe ser de 15 caracteres"));
    }

    @Test
    public void given_objPersona_when_then_null(){
        System.out.println("Test 4");
        assertNull(String.valueOf(objPersona.getEmail()),null);
    }
}