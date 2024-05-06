
public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil.setCapacidadTanqueEstatico(45);
        Automovil toyota = new Automovil("fabricante","del año");
        toyota.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.BLANCO);
        toyota.setTipo(TipoAutomovil.PICKUP);

        Automovil mazda = new Automovil("Mazda","BT_50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);


        TipoAutomovil tipoToyota = toyota.getTipo();
        System.out.println("Tipo toyota: " + tipoToyota.getNombre());
        System.out.println("Tipo Desc toyota: " + tipoToyota.getDescripcion());

        switch (tipoToyota){
            case COUPE:
                System.out.println("El automovil es deportivo y de dos puertas");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte para empresas");
                break;
            case PICKUP:
                System.out.println("Es una camioneta de 4 puertas grande");
                break;
            case MUSTANG:
                System.out.println("Es un automovil clasico de 2 puertas");
                break;
            case CONVERTIBLE:
                System.out.println("es un automovil mediano compacto de 2 puetas deportivo");
                break;
        }

        TipoAutomovil[] tipo = TipoAutomovil.values();
        for (TipoAutomovil ta: tipo){
            System.out.print(ta + "=>" + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }
    }
}
