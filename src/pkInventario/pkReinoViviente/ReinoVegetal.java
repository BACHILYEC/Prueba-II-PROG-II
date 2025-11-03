package pkInventario.pkReinoViviente;

import pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor.plantaConFruto;

public abstract class  ReinoVegetal {
    private Boolean estaPodrido = false;
    private Boolean estaMaduro = false;
    private Boolean tieneFlor = false;
    private Boolean tieneFruto = false;
    private String nombreCientifico;
    private Float tamanio;
    
    public ReinoVegetal(Boolean tieneFlor, Boolean tieneFruto) {
        this.tieneFlor = tieneFlor;
        this.tieneFruto = tieneFruto;

    }
    public void crecer(Float tamanio){
        setTamanio(tamanio);
        System.out.println("Crecio: " + getTamanio() + "cm");
    }
    public Boolean getEstaPodrido() {
        return estaPodrido;
    }

    public void setEstaPodrido(Boolean estaPodrido) {
        this.estaPodrido = estaPodrido;
    }

    public Boolean getEstaMaduro() {
        return estaMaduro;
    }

    public void setEstaMaduro(Boolean estaMaduro) {
        this.estaMaduro = estaMaduro;
    }

    public Boolean getTieneFlor() {
        return tieneFlor;
    }

    public void setTieneFlor(Boolean tieneFlor) {
        this.tieneFlor = tieneFlor;
    }

    public Boolean getTieneFruto() {
        return tieneFruto;
    }

    public void setTieneFruto(Boolean tieneFruto) {
        this.tieneFruto = tieneFruto;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

}
