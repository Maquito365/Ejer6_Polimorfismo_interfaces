public class SensorSuelo extends Dispositivo implements Medible, Registrable{
    public SensorSuelo(int id, String nombre, double consumoElectrico, String fabricante){
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String medir(){
        return "Medición del sensor de suelo realizada.";
    }
    @Override
    public String registrar(){
        return "Sensor de suelo registrado correctamente.";
    }
}