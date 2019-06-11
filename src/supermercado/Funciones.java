/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;
    
/**
 *
 * @author 50378
 */
 
public class Funciones implements Interface{
    public void Inicio (){
        Inicio Ini = new Inicio();
        Ini.setVisible(true);
    }
    String txtNombre;
    String txtApellidos;
    String txtCantidad;
    String txtVencimiento;
    String txtPrecio;

    public Funciones(String txtNombre, int txtCantidad, String txtVencimiento, double txtPrecio) {
        this.txtNombre = "";
        this.txtCantidad = "";
        this.txtVencimiento = "";
        this.txtPrecio = "";
        
    }
}
