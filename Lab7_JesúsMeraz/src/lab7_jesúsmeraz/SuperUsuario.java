/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jesúsmeraz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús Meraz
 */
public class SuperUsuario extends Usuario {

    public int numero = 0;

    public SuperUsuario(String Nombre, String Apellido, String Username, String Password, int Nota) {
        super(Nombre, Apellido, Username, Password, Nota);
    }



    public boolean validar() {
        //int numero = 0;
        boolean existe = false;
        File file = new File("./Usuarios.jam");
        FileReader read;
        BufferedReader Save;
        int registreishon = 1;
        String text = "";
        String usuario = "";
        String contraseña = "";
        try {
            read = new FileReader(file);
            Save = new BufferedReader(read);

            while (text != null) {
                try {
                    text = Save.readLine();
                    usuario = text;
                    text = Save.readLine();
                    contraseña = text;
                    if (text != null) {
                        String username;
                        String password;
                        username = super.getUsername();
                        password = super.getPassword();
                        if (username.isEmpty() || password.isEmpty()) {
//                            JOptionPane.showMessageDialog(null, "Error, esta vacio intente de nuevo");
                            numero = 1;
                            break;
                        } else {
                            if (usuario.equals(username) && contraseña.equals(password)) {
                                existe = true;
                                numero = 1;
                                if (usuario.equals("ca.vallejo") && contraseña.equals("compi123")) {
                                    JOptionPane.showMessageDialog(null, "Bievenido mr Vallejo");
                                    Maestro JS = new Maestro();
                                    JS.setVisible(true);
                                }
                                break;

                            } else {
                                numero = 0;
                            }
                        }
                    }
                } catch (Exception e) {
                }
            }
            try {
                read.close();
                Save.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }

        return existe = true;
    }
}
