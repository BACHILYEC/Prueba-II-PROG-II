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
        if(naranjita.getEstaPodrido()){
            String frase = "No estoy retirando una " + naranjita.getNombreCientifico() + " porque esta podrida";
            return frase;
        }
        String frase = "Estoy retirando una " +  (naranjita.getNombreCientifico());
        return frase;     
    }

    public String retirar(Limon limoncito){
        if(limoncito.getEstaPodrido()){
            String frase = "No estoy retirando una " + limoncito.getNombreCientifico() + " porque esta podrida";
            return frase;
        }
        String frase = "Estoy retirando una " + limoncito.getNombreCientifico();
        return frase;
    }

    public String retirar(Durazno duraznito){
        if(duraznito.getEstaPodrido()){
            String frase = "No estoy retirando una " + duraznito.getNombreCientifico() + " porque esta podrida";
            return frase;
        }
        String frase = "Estoy retirando una " + duraznito.getNombreCientifico();
        return frase;
    }

    public String retirar(ReinaClaudia reinita){
        if(reinita.getEstaPodrido()){
            String frase = "No estoy retirando una " + reinita.getNombreCientifico() + " porque esta podrida";
            return frase;
        }
        String frase = "Estoy retirando una " + reinita.getNombreCientifico();
        return frase;
    }


}


