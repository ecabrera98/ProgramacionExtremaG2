package Testing;

import Principal.RegistrarCliente;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

    @RunWith(value = Parameterized.class)
    public class RegistrarEmailParametersTest {
        private String strAux;
        private String expected;

        @Parameterized.Parameters
        public static Iterable<Object[]> parameters() {
            List<Object[]> objects = new ArrayList<Object[]>();
            objects.add(new Object[]{"edison7905@gmail.com", "edison7905@gmail.com"});
            objects.add(new Object[]{"joselyn.taco@epn.edu.com","joselyn.taco@epn.edu.ec"});
            return objects;
        }

        public RegistrarEmailParametersTest(String strAux, String expected) {
            this.strAux = strAux;
            this.expected = expected;
        }

        @Test
        public void given_parameters_when_registraremail_then_cliente() {
            RegistrarCliente objCliente = new RegistrarCliente();
            String actual = objCliente.registrarEmail(strAux,"Ingrese su Correo Electrónico",
                    "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",
                    "El Correo Electrónico ingresado es inválido", 50,
                    "Ha exedido el tamaño máximo de caracteres");
            assertEquals(expected, actual);
        }


}
