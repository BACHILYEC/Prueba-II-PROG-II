package pkInventario.pkHumano;

import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.ReinaClaudia;
import pkInventario.pkReinoViviente.pkVegetal.PlantasSinFlor.SinVaso;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Durazno;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Naranja;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.PlantaConFruto;
import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.Limon;
public class Agricultor extends Persona {
    
    public Agricultor(String nombre, String apellido, String cedula){
        super(nombre, apellido, cedula);
    }
 public String sembrar(PlantaConFruto planta){
        String frase = "Estoy sembrando " + planta.getNombreCientifico(); 
        return frase;
    }

    public String abonar(SinVaso planta){
        String frase = "Estoy abonando mis plantas con " + planta.getNombreCientifico(); 
        return frase;
    }

    public void registrar(Durazno durazno, Limon limoncito, Naranja naranja, ReinaClaudia reinita){
        System.out.println("Estoy registrando: " + "\n" + durazno.getNombreCientifico() +"\n"+ limoncito.getNombreCientifico() + "\n"+ naranja.getNombreCientifico() +"\n"+ reinita.getNombreCientifico());
    }
    

}

