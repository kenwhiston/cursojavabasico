/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavabasico.clases;

/**
 *
 * @author whiston
 */
public class Alumna extends Persona {
    //extends es una palabra reservada
    //extends = hereda de una clase
    //hijo extends padre
    
    private String codigo;
    private double pagoPension;
    
    public Alumna(){
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPagoPension() {
        return pagoPension;
    }

    public void setPagoPension(double pagoPension) {
        this.pagoPension = pagoPension;
    }
    
    //metodo
    public void pagarPension(){
        System.out.println(this.getNombres()+ " - Esta pagando su cuota");
    }
}
