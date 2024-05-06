import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Motor motorToyota = new Motor(2.0,TipoMotor.GASOLINA);
        Automovil toyota = new Automovil("fabricante","del año");
        toyota.setMotor(motorToyota);
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda","BT_50",Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL),new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AZUL,
                new Motor(3.5,TipoMotor.GASOLINA),new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son iguales?" + (nissan == nissan2));
        System.out.println("Son iguales con equals" + (nissan.equals(nissan2)));
        //inbocamos el metodo de cada uno
        System.out.println(toyota.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(auto.equals(fecha));
        System.out.println("mazda.acelerar(3000) = " + mazda.acelerar(3000));
        System.out.println("mazda.frenar() = " + mazda.frenar());

        System.out.println("mazda.acelerarFrenar(4000) = " + mazda.acelerarFrenar(4000));

        System.out.println("mazda = " + mazda.calcularConsumo(300,0.75f));

        System.out.println("mazda = " + mazda.calcularConsumo(300,60));
        System.out.println("mazda = " + nissan.calcularConsumo(300,60));
        
    }
}
