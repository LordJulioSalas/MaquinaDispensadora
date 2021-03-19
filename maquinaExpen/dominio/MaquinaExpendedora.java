package maquinaExpen.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaquinaExpendedora {
    private String marca;
    private String Serie;
    private int capacidadMecato;
    private String capacidadProducto;
    private List<String> Golocinas= Arrays.asList("Ruffles","Platanitosdulces","Doritos","PlatanitosSal","DeToditoMix","Oreo"
    ,"Pirulin","ChocolateGalac","Flips","ChocolateCriCri");

    public MaquinaExpendedora(String marca, String serie, int capacidadMecato, String capacidadProducto) {
        this.marca = marca;
        this.Serie = serie;
        this.capacidadMecato = capacidadMecato;
        this.capacidadProducto = capacidadProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerie() {
        return Serie;
    }

    public int getCapacidadMecato() {
        return capacidadMecato;
    }

    public String getCapacidadProducto() {
        return capacidadProducto;
    }

    public void setCapacidadMecato(int capacidadMecato) {
        this.capacidadMecato = capacidadMecato;
    }

    public void setCapacidadProducto(String capacidadProducto) {
        this.capacidadProducto = capacidadProducto;
    }

}
