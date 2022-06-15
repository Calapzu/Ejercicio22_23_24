import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

     UsuariosDBEstadisticas usuariosDB = new UsuariosDBEstadisticas();

    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDB.obtener();
    }

    public Usuario obtenerUsuario(String username){
        ArrayList<Usuario> usuarios = usuariosDB.obtener();

        for (Usuario usuarioActual: usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)){
                return usuarioActual;
            }
        }
        return null;
    }

    public void crearUsuario(Usuario usuario){
        if (obtenerUsuario(usuario.nombreUsuario) != null){
            return;
        }

        usuariosDB.insertar(usuario);
    }

    public void borrarUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }
}
