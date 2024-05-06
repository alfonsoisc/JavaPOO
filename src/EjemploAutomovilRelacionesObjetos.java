
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorToyota = new Persona("Lucy", "Martinez");
        Automovil toyota = new Automovil("fabricante","del año");
        toyota.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.BLANCO);
        toyota.setTipo(TipoAutomovil.PICKUP);
        toyota.setConductor(conductorToyota);
        //toyota.setRuedas(ruedasTo);

        Rueda[] ruedasTo = new Rueda[5];
        for (int i = 0; i < ruedasTo.length; i++){
            toyota.addRuedas (new Rueda("Yokohama", 16,7.5));
        }

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT_50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedaMaz);

        Rueda[] ruedaMaz = new Rueda[5];
        for (int i = 0; i < ruedaMaz.length; i++){
            mazda.addRuedas( new Rueda("Michelin", 18, 10.5));
        }


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL),new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRuedas(new Rueda("Pirrelli", 20, 11.5))
                .addRuedas(new Rueda("Pirrelli", 20, 11.5))
                .addRuedas(new Rueda("Pirrelli", 20, 11.5))
                .addRuedas(new Rueda("Pirrelli", 20, 11.5))
                .addRuedas(new Rueda("Pirrelli", 20, 11.5));


        Rueda[] ruedasNissan2 = {new Rueda("Pirrelli", 22, 11.5),
                new Rueda("Pirrelli", 22, 11.5),
                new Rueda("Pirrelli", 22, 11.5),
                new Rueda("Pirrelli", 22, 11.5),
                new Rueda("Pirrelli", 22, 11.5)};
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,
                new Motor(3.5,TipoMotor.GASOLINA),new Estanque(50), lalo, ruedasNissan2);
        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AZUL);
        nissan2.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.MUSTANG);

        System.out.println(toyota.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor Toyota:" + toyota.getConductor());
        System.out.println("Ruedas Toyota: ");
        for (Rueda r : toyota.getRuedas()){
            System.out.println(r.getFabricante() + " ,aro" + r.getAro() + ", ancho:" + r.getAncho());
        }*/


    }
}
