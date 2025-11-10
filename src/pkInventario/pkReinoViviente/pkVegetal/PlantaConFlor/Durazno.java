package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;

public class Durazno extends PlantaConFruto {

    public Durazno(){
        super(true,true);
        setNombreCientifico("Durazno (Prunus persica)");
    }

    public void injertarConReinaClauda(ReinaClaudia reinita){
        System.out.println("Soy un durazno y estoy injertandome con " + reinita.getNombreCientifico());
    }

}
