package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario extends JFrame {

    public Usuario() {
        initialize();
    }

    private void initialize() {
        JTextField txtuser;
        JPasswordField txtpasswd;
        JButton btnAcpt;
        JLabel lblUsuario, lblPasswd;
        JPanel contentpane;

        //hacemos visible la ventana(Jframe) y le damos coordenadas donde aparezca
        setBounds(600, 600, 350, 180);
            setVisible(true);
            //Incertamos el panel(contenetpanel) y le damos color de fondo
            contentpane = new JPanel();
            contentpane.setBackground(Color.WHITE); //puedes cambiar el color aquí
            setContentPane(contentpane);
            contentpane.setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblUsuario = new JLabel();
        lblUsuario.setBounds(35, 15, 100, 25);
        lblUsuario.setText("Usuario");
        contentpane.add(lblUsuario);
        lblPasswd = new JLabel();
        lblPasswd.setBounds(35, 55, 100, 25);
        lblPasswd.setText("Contraseña");
        contentpane.add(lblPasswd);
            //Asignamos textos
            txtuser = new JTextField();
            txtpasswd = new JPasswordField();
            //Asignamos botones
            btnAcpt = new JButton();
            //insetamos los textos, les damos coordenadas y un texto
            txtuser.setBounds(155, 15, 160, 25);
            contentpane.add(txtuser);
            //texto 2 metodo igual al anterior
            txtpasswd.setBounds(155, 55, 160, 25);
            contentpane.add(txtpasswd);
            //insetamos el boton, le damos coordenadas y un texto
            btnAcpt.setBounds(95, 105, 160, 25);
            contentpane.add(btnAcpt);
            btnAcpt.setText("Aceptar");
            btnAcpt.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {

                    if(txtuser.getText().toString().equals("ricardo") && txtpasswd.getText().toString().equals("jstp")){
                        setVisible(false);
                        System.out.println("Usted a ingresado como Administrador");
                        System.out.println("ROL: ADMINISTRADOR\n"+"Usuario: RICARDO VALLADARES\n");
                        Comprar objcomprar = new Comprar(8);

                    }
                }
            });

    }



}
