package maquinaExpen.dominio;

import java.util.List;

public class Producto {
    private String marca;
    private List<Producto> productoList;

    public String getMarca() {
        return marca;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }
}
