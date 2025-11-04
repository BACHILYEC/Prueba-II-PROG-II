package pkInventario;

import pkInventario.pkHumano.Agricultor;
import pkInventario.pkHumano.Cliente;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;

public class AppInventario {
    public static void main(String[] args) {
        System.out.println("Aplicación de Inventario de Agricultor");
    
        Agricultor agricultor1 = new Agricultor();
        System.out.println("Agricultor creado.");
        Cliente cliente1 = new Cliente();
        System.out.println("Cliente creado.");

        agricultor1.cosechar();
        System.out.println("Cosecha realizada por el agricultor.");

        Durazno durazno = new Durazno();
        ReinaClaudia reinaClaudia = new ReinaClaudia();
        Naranja naranja = new Naranja();
        Limon Limon = new Limon();

        agricultor1.injertarDR(durazno, reinaClaudia);
        System.out.println("Injerto de Durazno y Reina Claudia realizado por el agricultor.");

        agricultor1.injertarNL(naranja, Limon);
        System.out.println("Injerto de Naranja y Limón realizado por el agricultor.");
    
        agricultor1.abonar();
        System.out.println("Abono realizado por el agricultor.");

        agricultor1.insertarInventario();
        System.out.println("Inventario actualizado por el agricultor.");

        cliente1.visualizar();
        System.out.println("Cliente visualizó las frutas.");

        cliente1.retirar();
        System.out.println("Cliente retiró las frutas.");

    }
}
