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
public class Persona {
    //niveles de accesibilidad
    //private = privado
    //public = publico
    //protected = protegido
    //tipo de datos: int, long, byte, char, float, double, decimal
    //String, Integer, Long, Character
    //nombre de la variable, minisculas, sin espacios ni caracteres especiales &%#", _
    private String dni;//12345678
    private String apellidos;
    private String nombres;
    private String fechaNac;
    private char genero;//M - F
    private String direccion;
    
    //necesita un constructor
    public Persona(){
        //inicializa el objeto
    }
    
    //encapsulamiento

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //metodos
    //void = no devuelve nada
    public void caminar(){
        System.out.println(this.getNombres() + " - Esta caminando...");
    }
    
}
