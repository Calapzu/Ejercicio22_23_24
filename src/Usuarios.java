import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

    private UsuariosDB usuariosDB = new UsuariosDB();

    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDB.convertirUsuariosFicheroEnArrayList();
    }

    public Usuario obtenerUsuario(String username){
        ArrayList<Usuario> usuarios = usuariosDB.convertirUsuariosFicheroEnArrayList();

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
