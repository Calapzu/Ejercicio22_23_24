public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 1;

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open2";
        usuario2.apellidos = "Bootcamp2";
        usuario2.email = "ejemplos2@open-bootcamp.com";
        usuario2.nivelAcceso = 10;

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos3@open-bootcamp.com";
        usuario3.nivelAcceso = 5;

        Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);
        usuarios.crearUsuario(usuario2);
        usuarios.crearUsuario(usuario3);

        //Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp");
        //System.out.println("Email del usuario obtenido: " + openbootcamp.email);

        UsuariosNiveles openbootcamp = new UsuariosNiveles();
        System.out.println("Es adminitrador?: " + openbootcamp.esAdministrador(usuario));
        System.out.println("Es adminitrador?: " + openbootcamp.esAdministrador(usuario2));
        System.out.println("Es adminitrador?: " + openbootcamp.esAdministrador(usuario3));

        //usuarios.borrarUsuario("openbootcamp");
        //usuarios.borrarUsuario("openbootcamp3");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println("Usuario actual: " + a.nombreUsuario);
            System.out.println("----------------" + "-".repeat(a.nombreUsuario.length()));
            System.out.println(a);
            System.out.println();
        }

        System.out.println("Totla inserciones: " + usuarios.usuariosDB.getTotalInserciones());
        System.out.println("Totla inserciones: " + usuarios.usuariosDB.getTotalElimianciones());
    }
}
