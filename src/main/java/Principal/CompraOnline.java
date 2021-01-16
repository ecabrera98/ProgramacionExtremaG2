package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CompraOnline extends JInternalFrame {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CompraOnline window = new CompraOnline();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("Proyecto Primer Bimestres Ingenieria de Software");
        System.out.println("Programación Extrema");

    }


    public CompraOnline() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(500, 500, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);


        JMenu mnArchivo = new JMenu("Registrar Cliente");
        menuBar.add(mnArchivo);


        JMenuItem mntmNewMenuItem_1 = new JMenuItem("CLIENTE CENTRO COMERCIAL");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Principal.RegistrarCliente objPA = new   Principal.RegistrarCliente();
                objPA.Clientes();
            }
        });
        mnArchivo.add( mntmNewMenuItem_1);


        JMenu mnReportes = new JMenu("Tiendas");
        menuBar.add(mnReportes);

        JMenu mnTienda1 = new JMenu("ETAFASHION");
        mnReportes.add(mnTienda1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Deportiva");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Comprar objVA = new Comprar(0);
                objVA.Producto(0);
            }
        });
        mnTienda1.add(mntmNewMenuItem_2);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Casual");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Comprar objVA = new Comprar(1);
                objVA.Producto(1);
            }
        });
        mnTienda1.add(mntmNewMenuItem_3);

        JMenu mnTienda2 = new JMenu("LA GANGA");
        mnReportes.add(mnTienda2);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Electrodomesticos");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Comprar objVA = new Comprar(2);
                objVA.Producto(2);
            }
        });
        mnTienda2.add(mntmNewMenuItem_4);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Tecnologia");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Comprar objVA = new Comprar(3);
                objVA.Producto(3);
            }
        });
        mnTienda2.add(mntmNewMenuItem_5);

        JMenuItem mnCarrito = new JMenuItem("Carrito");
        mnCarrito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Principal.Pedido objC = new   Principal.Pedido();
                objC.Carrito();
            }
        });
        mnReportes.add(mnCarrito);

        JMenu mnManual = new JMenu("Manual");
        menuBar.add(mnManual);

        JMenuItem mntmNewMenuItem_N = new JMenuItem("Servicio Técnico");
        mntmNewMenuItem_N.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Principal.Manual objST = new   Principal.Manual();
                objST.Manual();
            }
        });
        mnManual.add(mntmNewMenuItem_N);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(23, 11, 374, 204);
        frame.getContentPane().add(layeredPane);


    }
}

