package Testing;

import Principal.Comprar;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PedidoTest {
    private Comprar objComprar;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        objComprar = new Comprar(4);
    }



    @Test
    public void given_objComprar_when_then_fail(){
        System.out.println("Test 5");
        try {
            objComprar.subtotalPay("25","0");
        } catch (Exception e) {
            fail("Se esperaba excepcion");
        }

    }

    @Test
    public void given_objComprar_when_then_true(){
        System.out.println("Test 6");
        assertTrue(objComprar.AddProducts(1));
    }

    @Test
    public void given_objComprar_when_then_false(){
        System.out.println("Test 7");
        assertFalse(objComprar.AddProducts(0));
    }


    @Test
    public void given_objComprar_when_then_equals(){
        String [][] pedido = {{"Pantaloneta","50"},{"Camiseta","20"}};
        System.out.println("Test 8");
        assertEquals(70,objComprar.totalPay(pedido,2));
    }

    @Test
    public void given_objComprar_when_then_ok(){
        Comprar c = Mockito.mock(Comprar.class);
        String [][] pedido = {{"Pantaloneta","50"},{"Camiseta","20"}};
        System.out.println("Test Mockito 1");
        Mockito.when(c.totalPay(pedido,2)).thenReturn(70);
        assertEquals(70,c.totalPay(pedido,2));
    }

    @Test
    public void given_objComprar_when_then_null(){
        Comprar c = Mockito.mock(Comprar.class);
        String [][] pedido = {{"Pantaloneta","50"},{"Camiseta","20"}};
        System.out.println("Test Mockito 2");
        Mockito.when(c.totalPay(pedido,2)).thenReturn(70);
        assertNotSame(80,c.totalPay(pedido,2));
    }

}