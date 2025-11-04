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
        String frase = "";    
        return frase;
    }
    public String sembrarNaranja(Naranja naranja){
        String frase = "";
        return frase;
    }

    public String sembrarDurazno(Durazno durazno){
        String frase = "";
        return frase;
    }

    public String sembrarReinaClaudia(ReinaClaudia reinaClaudia){
        String frase = "";
        return frase;
    }

    public String abonar(MusgoTurbera musgo){
        String frase = "";
        return frase;
    }
}
package pkInventario.pkHumano;

import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
public class Agricultor extends Persona {
public Agricultor(){
    super();
}
public String cosechar(){
    String frase = "";    
    return frase;
}
public String injertarDR(Durazno dr, ReinaClaudia RC){
    String frase = "";
    return frase;
}
public String injertarNL(Naranja naranja, Limon Limon){
    String frase = "";
    return frase;
}

public String insertarInventario(){
    String frase = "";
    return frase;
}
public String abonar(){
    String frase = "";
    return frase;
}
}
