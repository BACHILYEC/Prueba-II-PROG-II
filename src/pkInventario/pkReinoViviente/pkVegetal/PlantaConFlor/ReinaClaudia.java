package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;


public class ReinaClaudia extends PlantaConFruto {
  
  public ReinaClaudia(){
    super(true,true);
  }

  public String injertarConLimon(Limon limon){
    String frase = "Me injerté con: " + limon.getNombreCientifico() + "Ahora soy Limón-Reina";
    return frase;
  }



}