package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;


public class ReinaClaudia extends PlantaConFruto {
  public ReinaClaudia(){
    super(true,true);
    setNombreCientifico("Reina Claudia (Prunus domestica subsp. italica)");
  }

  public void injerConLimon(Limon limoncito){

    System.out.println("Estoy injertandome con " + limoncito.getNombreCientifico());

  }

}