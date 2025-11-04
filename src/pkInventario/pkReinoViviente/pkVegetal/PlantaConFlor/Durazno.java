package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;

public class Durazno extends PlantaConFruto {

    public Durazno(){
        super(true,true);
    }

    public void injertarConReinaClauda(ReinaClaudia reinita){
        System.out.println("Estoy injertandome con " + reinita.getNombreCientifico());
    }

}
