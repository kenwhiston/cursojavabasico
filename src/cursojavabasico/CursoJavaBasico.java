/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavabasico;

import cursojavabasico.clases.Alumna;
import cursojavabasico.clases.Persona;

/**
 *
 * @author whiston
 */
public class CursoJavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaración de variable
        Persona blayarcito;
        Persona nayeli;
        Persona victor;
        
        //creacion de objetos
        blayarcito = new Persona();
        blayarcito.setNombres("Blayar");
        nayeli = new Persona();
        nayeli.setNombres("Nayeli");
        victor = new Persona();
        victor.setNombres("Victor");
        
        blayarcito.caminar();
        nayeli.caminar();
        victor.caminar();
        
        
        
        Alumna mechita = new Alumna();
        mechita.setNombres("Mercedes");
        mechita.caminar();
        mechita.pagarPension();
        
        //practica calificada 03
        //Crear 3 clases
        //1 clase padre
        //2 clases hijos
        //cada clase con 5 atributos minimo
        //cada clase con 3 metodos minimo
    }
    
}
