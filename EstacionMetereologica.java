public class EstacionMetereologica extends Dispositivo implements Medible {

    public EstacionMetereologica(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String medir() {
        return "Medición de la estación meteorológica realizada.";
    }
}


