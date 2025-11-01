public abstract class Dispositivo implements Comparable<Dispositivo>{
    private int id;
    private String nombre;
    private double consumoElectrico;
    private String fabricante;

    public Dispositivo(int id, String nombre, double consumoElectrico, String fabricante){
        this.id = id;
        this.nombre = nombre;
        this.consumoElectrico = consumoElectrico;
        this.fabricante = fabricante;
    }
    
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getConsumoElectrico(){
        return consumoElectrico;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setConsumoElectrico(double consumoElectrico){
        this.consumoElectrico = consumoElectrico;
    }

    @Override
    public String toString(){ // Representación en cadena del dispositivo
        return "Dispositivo [id=" + id + ", nombre=" + nombre + ", consumoElectrico=" + consumoElectrico 
                + ", fabricante=" + fabricante + "]";
    }

    @Override
    public int compareTo(Dispositivo otroDispositivo){ // Compara dispositivos por consumo eléctrico
        return Double.compare(this.consumoElectrico, otroDispositivo.getConsumoElectrico());
    }

    @Override // Redefinición del método equals para comparar por id
    public boolean equals(Object obj){ // Verifica si dos dispositivos son iguales basándose en su id
        if(this == obj) return true; //Si son el msimo objeto retorna true
        if(!(obj instanceof Dispositivo)) return false; //Si no es una instancia de Dispositivo retorna false
        Dispositivo d=(Dispositivo) obj;  
        return this.id == d.getId(); //Compara los ids de ambos dispositivos
    }
}