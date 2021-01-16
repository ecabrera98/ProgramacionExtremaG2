package Testing;

import Principal.RegistrarCliente;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class RegistrarCelularParametersTest {
    private String strAux;
    private String expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> numbers() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"0123456789","0979025335"});
        objects.add(new Object[]{"0987413874","0987413874"});
        return objects;
    }

    public RegistrarCelularParametersTest(String strAux, String expected) {
        this.strAux = strAux;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_celularcliente_then_cliente() {
        RegistrarCliente objCliente = new RegistrarCliente();
        String actual = objCliente.registrarCelular(strAux,"Ingrese su Teléfono Celular",
                "^([0-9])*", "El teléfono celular ingresado es inválido",
                10, "El teléfono celular debe ser de 10 caracteres");
        assertEquals(expected, actual);
    }
}
