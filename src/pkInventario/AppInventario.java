package pkInventario;

import pkInventario.pkHumano.Agricultor;
import pkInventario.pkHumano.Cliente;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;
import pkInventario.pkReinoViviente.pkVegetal.PlantasSinFlor.MusgoTurbera;

public class AppInventario {
    Cliente cliente = new Cliente("Pedro", "Bosques", "1234859561");

    Agricultor agricultor = new Agricultor("Martin", "Garrix", "1238686868");

    Naranja naranja = new Naranja();

    Limon limon = new Limon();

    Durazno durazno = new Durazno();

    ReinaClaudia reinita = new ReinaClaudia();

    MusgoTurbera musguito = new MusgoTurbera();

    public void presentar() {

        System.out.println("\nPresentando al agricultor  " + agricultor.getNombre() + " " + agricultor.getApellido()
                + " con cedula " + agricultor.getCedula());

        System.out.println("Presentando al cliente " + cliente.getNombre() + " " + cliente.getApellido()
                + " con cedula " + cliente.getCedula());

        System.out.println();
    }

    public void requerir1() {

        System.out.println("Requerimiento 1: ");
        System.out.println(agricultor.sembrar(limon));
        System.out.println(agricultor.sembrar(naranja));
        System.out.println(agricultor.sembrar(reinita));
        System.out.println(agricultor.sembrar(durazno));
        

        System.out.println();
    }

    public void requerir2() {
        System.out.println("Requerimiento 2:");

        System.out.println(agricultor.abonar(musguito));

        System.out.println();

    }

    public void requerirVarios() {
        System.out.println("Requerimientos 3,4,5 y 6 :");

        naranja.injertarConDurazno(durazno);

        durazno.injertarConReinaClauda(reinita);

        reinita.injerConLimon(limon);

        limon.injertarConNaranja(naranja);

        System.out.println();

    }

    public void requerir7() {
        System.out.println("Requerimiento 7: ");

        System.out.println("Soy el agricultor " + agricultor.getNombre() + " y estoy registrando mi cosecha: \n");

        agricultor.registrar(durazno, limon, naranja, reinita);

        System.out.println();

    }

    public void requerir8() {
        durazno.setEstaMaduro(true);
        System.out.println("Requerimiento 8: ");

        System.out.println("*** VISUALIZANDO COSECHA ***");

        cliente.visualizar(naranja, durazno, limon, reinita);

        System.out.println();
    }

    public void requerir9() {
        reinita.setEstaPodrido(true);
        System.out.println("Requerimiento 9: ");

        System.out.println("Soy el cliente " + cliente.getNombre() + " y estoy retirando los siguientes productos: \n");

        System.out.println("*** RETIRANDO PRODUCTOS ***");
        System.out.print(cliente.retirar(reinita) + "\n" + cliente.retirar(limon) + "\n" + cliente.retirar(naranja)
                + "\n" + cliente.retirar(durazno));
        System.out.println();

    }

}
