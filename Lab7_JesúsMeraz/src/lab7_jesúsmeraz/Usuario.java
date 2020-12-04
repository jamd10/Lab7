package lab7_jesúsmeraz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Usuario {

    public int numero = 0;
    private String Nombre;
    private String Apellido;
    private String Username;
    private String Password;
    private int Nota;

    public Usuario(String Nombre, String Apellido, String Username, String Password, int Nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Username = Username;
        this.Password = Password;
        this.Nota = Nota;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean validar() {
        //int numero = 0;
        boolean existe = false;
        File file = new File("./Usuarios.txt");
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
                        username = Username;
                        password = Password;
                        if (username.isEmpty() || password.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Error, esta vacio intente de nuevo");
                            numero = 1;
                            break;
                        } else {
                            if (usuario.equals(username) && contraseña.equals(password)) {
                                existe = true;
                                numero = 1;
                                if ((usuario.equals("ca.vallejo") && contraseña.equals("compi123"))) {
//                                    JOptionPane.showMessageDialog(null, "Bievenido mr Vallejo");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Bienvenido " + username);
                                    Alumnos p = new Alumnos();
                                    p.setVisible(true);
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

    public void registrarusuario() {

        File file = new File("./Usuarios.txt");
        FileWriter write;
        PrintWriter writeline;
        String name = Nombre;
        String lastN = Apellido;
        String user = Username;
        String pass = Password;
        String num = Integer.toString(Nota);
        if (!file.exists()) {

            try {
                file.createNewFile();

                write = new FileWriter(file, true);
                writeline = new PrintWriter(write);
                writeline.println(name);
                writeline.println(lastN);
                writeline.println(user);
                writeline.println(pass);
                writeline.println(num);

                write.close();
                writeline.close();

            } catch (Exception e) {
            }
        } else {
            if (user.isEmpty() && pass.isEmpty() && name.isEmpty() && lastN.isEmpty() && num.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Espacios vacios", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
            } else {

                try {
                    name = Nombre;
                    lastN = Apellido;
                    user = Username;
                    pass = Password;
                    num = Integer.toString(Nota);
                    write = new FileWriter(file, true);
                    writeline = new PrintWriter(write);
                    writeline.println(name);
                    writeline.println(lastN);
                    writeline.println(user);
                    writeline.println(pass);
                    writeline.println(num);
                    JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente");
                    write.close();
                    writeline.close();

                } catch (Exception e) {

                }
            }
        }
    }

    public boolean validar2() {
        //int numero = 0;
        boolean existe = false;
        File file = new File("./Usuarios.txt");
        FileReader read;
        BufferedReader Save;
        int regis = 1;
        String text = "";
        String usuario = "";
        String contraseña = "";
        String Nombre1 = "";
        String Apellido1 = "";
        String Nota1 = "";

        try {
            read = new FileReader(file);
            Save = new BufferedReader(read);

            while (text != null) {
                try {
                    text = Save.readLine();
                    usuario = text;
                    text = Save.readLine();
                    contraseña = text;
                    text = Save.readLine();
                    Nombre1 = text;
                    text = Save.readLine();
                    Apellido1 = text;
                    text = Save.readLine();
                    Nota1 = text;

                    if (text != null) {
                        String name = Nombre;
                        String lastN = Apellido;
                        String user = Username;
                        String pass = Password;
                        String num = Integer.toString(Nota);
                        if (user.isEmpty() && pass.isEmpty() && name.isEmpty() && lastN.isEmpty() && num.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Espacios vacios", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                            numero = 1;
                            break;
                        } else {
                            if (usuario.equals(user)) {
                                JOptionPane.showMessageDialog(null, "Lo sentimos pero este usuario ya existe, inicia sesion");
                                existe = true;
                                numero = 1;
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
