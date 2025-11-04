package pkInventario.pkHumano;

import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;
import pkInventario.pkReinoViviente.pkVegetal.PlantasSinFlor.MusgoTurbera;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
public class Agricultor extends Persona {
    
    public Agricultor(String nombre, String apellido, String cedula){
        super(nombre, apellido, cedula);
    }

    public String sembrarLimon(Limon limon){
        String frase = "Estoy sembrando un " + limon.getNombreCientifico();    
        return frase;
    }
    public String sembrarNaranja(Naranja naranja){
        String frase = "Estoy sembrando un " + naranja.getNombreCientifico(); 
        return frase;
    }

    public String sembrarDurazno(Durazno durazno){
        String frase = "Estoy sembrando un " + durazno.getNombreCientifico(); 
        return frase;
    }

    public String sembrarReinaClaudia(ReinaClaudia reinaClaudia){
        String frase = "Estoy sembrando un " + reinaClaudia.getNombreCientifico(); 
        return frase;
    }

    public String abonar(MusgoTurbera musgo){
        String frase = "Estoy abonando mis plantas con " + musgo.getNombreCientifico(); 
        return frase;
    }
}

