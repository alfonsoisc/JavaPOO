
public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil.setCapacidadTanqueEstatico(45);
        Automovil toyota = new Automovil("fabricante","del año");
        toyota.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.BLANCO);
        toyota.setTipo(TipoAutomovil.PICKUP);

        Automovil mazda = new Automovil("Mazda","BT_50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
       // mazda.setEstanque(new Estanque());

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL),new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,
                new Motor(3.5,TipoMotor.GASOLINA),new Estanque(50));
        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AZUL);
        nissan2.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.MUSTANG);

        System.out.println(toyota.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilometro por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocodad maxima carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima cidad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoToyota = toyota.getTipo();
        System.out.println("Tipo toyota: " + tipoToyota.getNombre());
        System.out.println("Tipo Desc toyota: " + tipoToyota.getDescripcion());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
