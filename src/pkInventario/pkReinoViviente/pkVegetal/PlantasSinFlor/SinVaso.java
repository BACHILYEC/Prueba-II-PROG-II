package pkInventario.pkReinoViviente.pkVegetal.PlantasSinFlor;

import pkInventario.pkReinoViviente.ReinoVegetal;

public abstract class SinVaso extends ReinoVegetal {
    
    public SinVaso(Boolean tieneFlor, Boolean tieneFruto) {
        super(false, false);
    }
}
