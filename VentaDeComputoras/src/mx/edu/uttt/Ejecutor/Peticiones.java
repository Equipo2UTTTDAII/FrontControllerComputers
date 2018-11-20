/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Ejecutor;
import mx.edu.uttt.FrontController.Front.FrontController;
/**
 *
 * @author Diego
 */
public class Peticiones {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
   
      frontController.dispatchRequest("HOME");
      frontController.dispatchRequest("Articulos");
      frontController.dispatchRequest("Ventas");
      frontController.dispatchRequest("Detalle de ventas");
    }
}
