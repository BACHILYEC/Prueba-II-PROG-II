package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;

public class Naranja extends PlantaConFruto{
    public Naranja(){
        super(true,true);
    }

    public void injertarConDurazno(Durazno duraznito){
        System.out.println("Estoy injertandome con " + duraznito.getNombreCientifico());
    }










}
