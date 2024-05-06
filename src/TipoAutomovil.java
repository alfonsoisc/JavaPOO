public enum TipoAutomovil {
    MUSTANG("Mustag", "Auto Mediano", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    PICKUP("Pickup","Camioneta",4),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgon", "Auto utilitario",4),
    SUV("SUV", "Todo Terreno deportivo",5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion ,int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
