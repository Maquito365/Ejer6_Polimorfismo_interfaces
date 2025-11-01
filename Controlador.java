import java.util.*;
public class Controlador{
    private List<Dispositivo> catalogo = new ArrayList<>();

    public Controlador() {
        inicializar();
    }

    private void inicializar() {
        catalogo.add(new SensorSuelo(1, "Sensor Norte", 12.5, "AgroTech"));
        catalogo.add(new SensorSuelo(2, "Sensor Sur", 10.2, "GreenSense"));
        catalogo.add(new EstacionMetereologica(3, "Estación Central", 30.0, "WeatherPro"));
        catalogo.add(new EstacionMetereologica(4, "Estación Este", 25.5, "SkyData"));
        catalogo.add(new DronRiego(5, "Dron A1", 50.0, "FlyFarm"));
        catalogo.add(new DronRiego(6, "Dron B2", 48.3, "AgroDrone"));
        catalogo.add(new SensorSuelo(7, "Sensor Este", 11.7, "SoilMaster"));
        catalogo.add(new EstacionMetereologica(8, "Estación Oeste", 27.8, "WeatherTech"));
        catalogo.add(new DronRiego(9, "Dron C3", 52.1, "FieldEye"));
        catalogo.add(new SensorSuelo(10, "Sensor Centro", 9.8, "EcoSense"));
    }

    public List<Dispositivo> listar() {
        return catalogo;
    }

    public Dispositivo buscarPorId(int id) {
        for (Dispositivo d : catalogo) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    public Dispositivo buscarPorNombre(String nombre) {
        for (Dispositivo d : catalogo) {
            if (d.getNombre().equalsIgnoreCase(nombre)) return d;
        }
        return null;
    }

    public List<Dispositivo> ordenarPorConsumo() {
        List<Dispositivo> copia = new ArrayList<>(catalogo);
        Collections.sort(copia);
        return copia;
    }
}
