public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Vista vista = new Vista();

        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    vista.mostrarLista(controlador.listar());
                    break;
                case 2:
                    int id = vista.pedirId();
                    Dispositivo d1 = controlador.buscarPorId(id);
                    vista.mostrarMensaje(d1 != null ? d1.toString() : "No encontrado.");
                    break;
                case 3:
                    String nombre = vista.pedirNombre();
                    Dispositivo d2 = controlador.buscarPorNombre(nombre);
                    vista.mostrarMensaje(d2 != null ? d2.toString() : "No encontrado.");
                    break;
                case 4:
                    vista.mostrarLista(controlador.ordenarPorConsumo());
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 0);
    }
}

