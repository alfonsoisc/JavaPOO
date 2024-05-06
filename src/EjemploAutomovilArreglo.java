import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {



        Persona conductorToyota = new Persona("Lucy", "Martinez");
        Automovil toyota = new Automovil("fabricante","del año");
        toyota.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.BLANCO);
        toyota.setTipo(TipoAutomovil.PICKUP);
        toyota.setConductor(conductorToyota);

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT_50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL),new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki","Vitara",Color.AMARILLO,
                new Motor(1.6,TipoMotor.GASOLINA),new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Luis","Soto"));

        Automovil[] autos = new Automovil[5];
        autos[0] = toyota;
        autos[1] = mazda;
        autos[2] = suzuki;
        autos[3] = nissan;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }


    }
}
