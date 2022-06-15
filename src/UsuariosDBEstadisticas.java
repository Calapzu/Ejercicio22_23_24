public class UsuariosDBEstadisticas extends UsuariosDB {
    private int totalInserciones = 0;
    private int totalElimianciones = 0;

    @Override
    public void insertar(Usuario usuario){
        super.insertar(usuario);
        totalInserciones++;
    }

    @Override
    public void borrar(Usuario usuario){
        super.borrar(usuario);
        totalElimianciones ++;
    }

    public int getTotalInserciones() {
        return totalInserciones;
    }

    public int getTotalElimianciones() {
        return totalElimianciones;
    }
}
