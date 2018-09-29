/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_bxco;

/**
 *
 * @author marvi
 */
public class JavaApplication_BXCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Invocar al constructor de la clase Bd
        new bd("banxico");
        //Crear un objeto de la clase View
        view vista  = new view();
        //Crear un objeto de la clase Controller
        controller controlador  = new controller(vista);
        //Vincular la vista y el controlador
        vista.conectaControlador(controlador);
        
    }
    
}
