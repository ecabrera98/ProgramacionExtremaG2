package Principal;

import Servicios.Producto;

import javax.swing.*;

public class Comprar {

    public static int intTamaño = 0;
    public int intTotal =0;
    public static String [][] productsDeporting = {{"Pantaloneta","15"},{"Camiseta","10"},{"Gorra","5"},{"Short","15"}};
    public static String [][] productsClassics = {{"Camisa","23"},{"Pantalon","20"},{"Chaqueta","25"},{"Corbata","5"}};
    public static String [][] productosElectrodomestico = {{"Refrigeradora","350"},{"Cosina","310"},{"Lavadora","256"},{"Microhondas","250"}};
    public static String [][] productsTechnology = {{"Samsung A30","270"},{"Laptop DELL","870"},{"Tablet","240"},{"Audifonos","15"}};
    public static String [][] pedido = new String[100][2];

    Producto objProducto = new Producto();
    int iSiga=0;
    String strAux="";
    String strAuxProd="";
    String strAuxProdCantidad="";
    String strTextoPantalla="";
    boolean blnchitory=false;
    boolean blnfla=false;

    public Comprar(int val){

        if(val == 0) {
            System.out.println("Productos disponbles");
            System.out.println("Categoria Deportes");
            mostrarListaProductos(productsDeporting,productsDeporting.length);
            Producto(0);
        } else if(val == 1) {
            System.out.println("Productos disponbles");
            System.out.println("Categoria Clasicos");
            mostrarListaProductos(productsClassics,productsClassics.length);
            Producto(1);
        } else if(val == 2) {
            System.out.println("Productos disponbles");
            System.out.println("Categoria Electrodomesticos");
            mostrarListaProductos(productosElectrodomestico,productosElectrodomestico.length);
            Producto(2);
        } else if(val == 3) {
            System.out.println("Productos disponbles");
            System.out.println("Categoria Tecnologia");
            mostrarListaProductos(productsTechnology,productsTechnology.length);
            Producto(3);
        }

    }

    public void Producto(int val)
    {
        while (blnfla == false) {
            strAux = JOptionPane.showInputDialog("Ingrese el producto", strTextoPantalla); //pedimos al usuario que ingrese el producto a comprar

            if(val == 0){
                RegistrarProducto(productsDeporting,strAux);
            } else
            if(val == 1){
                RegistrarProducto(productsClassics,strAux);
            }else
            if(val == 2){
                RegistrarProducto(productosElectrodomestico,strAux);
            } else
            if(val == 3){
                RegistrarProducto(productsTechnology,strAux);
            }
            objProducto.setNombre(strAux);//llenamos la clase bean con el dato obtenido en el ejecutable
            subtotalPay(strAuxProd,strAuxProdCantidad);
            pedido[intTamaño-1][0] = objProducto.getNombre();
            pedido[intTamaño-1][1] = objProducto.getPrecio();
            //incializamos la variables a vacio
            clear();
            // caja de confirmación para que el usuario decida si quiere más operaciones.
            iSiga=JOptionPane.showConfirmDialog(null, "Confirme si desea ingresar nuevos datos");
            blnfla=AddProducts(iSiga);
        }
    }

    public void subtotalPay(String strAuxProd, String strAuxProdCantidad) {
        objProducto.setPrecio(Integer.toString(Integer.parseInt(strAuxProd) * Integer.parseInt(strAuxProdCantidad)));
    }

    public boolean AddProducts(int iSiga) {
        boolean blnflaresult =false;
        if (iSiga!=0){
            blnflaresult = true;
        }
        return blnflaresult;
    }

    public void Pedido (){
        System.out.println("Lista de productos pedidos");
        mostrarListaProductos(pedido, intTamaño);

        System.out.println("Total a pagar:"+ totalPay(pedido,intTamaño));
    }

    public int totalPay(String [][] matrixPedido, int intTamaño) {

        for (int x = 0; x < intTamaño; x++) {
            for (int y = 0; y < 1; y++) {
                intTotal = intTotal + Integer.parseInt(matrixPedido[x][1]);
            }
            System.out.print("\n");
        }

        return intTotal;
    }

    public void mostrarListaProductos(String[][] matriz, int tamaño){

        for (int x = 0; x < tamaño; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(matriz[x][y] + "\t\t");
            }
            System.out.print("\n");
        }
    }

    private void clear() {
        strAux = "";
        strAuxProd = "";
        strTextoPantalla = "";
    }
    public void RegistrarProducto(String [][] matrix,String strAux) {
        do {

            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < 1; y++) {
                    if (matrix[x][y].equals(strAux)) {
                        strAuxProd= matrix[x][y+1];
                        intTamaño = intTamaño +1;
                        strAuxProdCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de productos", strTextoPantalla);
                        blnchitory = true;
                        break;
                    }
                }
            }
        } while (blnchitory == false);
    }


}
