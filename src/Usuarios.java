import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    UsuariosDB usuariosDB;
     //UsuariosDBEstadisticas usuariosDB = new UsuariosDBEstadisticas();


    public Usuarios(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }
    protected Usuarios(){}

    public ArrayList<Usuario> listar() {
        return usuariosDB.obtener();
    }

    public Usuario obtener(String username){
        ArrayList<Usuario> usuarios = usuariosDB.obtener();

        for (Usuario usuarioActual: usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)){
                return usuarioActual;
            }
        }
        return null;
    }

    public void crear(Usuario usuario){
        if (obtener(usuario.nombreUsuario) != null){
            return;
        }

        usuariosDB.insertar(usuario);
    }

    public void borrar(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }
}
