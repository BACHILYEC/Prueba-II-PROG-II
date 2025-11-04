package pkInventario.pkHumano;

import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;

public class Cliente extends Persona {
    
    public Cliente(String nombre, String apellido, String cedula){
        super(nombre, apellido, cedula);
    }


    public String retirar(Naranja naranjita){

        String frase = "Estoy retirando una " + naranjita.getNombreCientifico();
        return frase;
    }

    public String retirar(Limon limoncito){
        String frase = "Estoy retirando una " + limoncito.getNombreCientifico();
        return frase;
    }

    public String retirar(Durazno duraznito){
        String frase = "Estoy retirando una " + duraznito.getNombreCientifico();
        return frase;
    }

    public String retirar(ReinaClaudia reinita){
        String frase = "Estoy retirando una " + reinita.getNombreCientifico();
        return frase;
    }




}


