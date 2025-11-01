import java.util.*;

public class Vista{
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú Cooperativa Agro-Tecnológica ===");
        System.out.println("1. Listar dispositivos");
        System.out.println("2. Buscar dispositivo por ID");
        System.out.println("3. Buscar dispositivo por nombre");
        System.out.println("4. Ordenar por consumo eléctrico");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public void mostrarLista(List<Dispositivo> dispositivos) {
        for (Dispositivo d : dispositivos) {
            System.out.println(d);
        }
    }

    public int pedirId() {
        System.out.print("Ingrese ID: ");
        return sc.nextInt();
    }

    public String pedirNombre() {
        sc.nextLine();
        System.out.print("Ingrese nombre: ");
        return sc.nextLine();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}

