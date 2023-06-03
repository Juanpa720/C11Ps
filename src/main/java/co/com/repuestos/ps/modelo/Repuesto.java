package co.com.repuestos.ps.modelo;


import lombok.Data;

import java.util.Date;

@Data
public class Repuesto {
    //numeros No decimales  int, long

    public Repuesto() {

    }

    private long id;
    private int color;
    //Campos alfanumericos
    private String nombre;
    private String marca;
    private String modelo;
    //Capos decimales doble, float, bigDecimal:Se usa para operacion financieras:
    private double precio;

    //Fechas con date.
    private Date fechaInventario;

    private boolean venceElProducto;

}
