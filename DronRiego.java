public class DronRiego extends Dispositivo implements Medible, Accionable, Registrable {

    public DronRiego(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String medir() {
        return "Imágenes multiespectrales capturadas.";
    }

    @Override
    public String ejecutarAccion() {
        return "Rociando parcelas según nivel de humedad detectado.";
    }

    @Override
    public String registrar() {
        return "Informe de vuelo y acciones del dron almacenadas.";
    }
}

