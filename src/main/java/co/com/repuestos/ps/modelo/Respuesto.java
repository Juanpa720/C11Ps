package co.com.repuestos.ps.modelo;


import jakarta.persistence.Entity;

import java.util.Date;


public class Respuesto {
    //numeros No decimales  int, long

    public Respuesto() {

    }

    private  long id;
    private  int color;
    //Campos alfanumericos
    private String nombre;
    private  String marca;
    private  String modelo;
    //Capos decimales doble, float, bigDecimal:Se usa para operacion financieras:
    private double precio;

    //Fechas con date.
    private  Date fechaInventario;

    private   boolean venceElProducto;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaInventario() {
        return fechaInventario;
    }

    public void setFechaInventario(Date fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public boolean isVenceElProducto() {
        return venceElProducto;
    }

    public void setVenceElProducto(boolean venceElProducto) {
        this.venceElProducto = venceElProducto;
    }
}
