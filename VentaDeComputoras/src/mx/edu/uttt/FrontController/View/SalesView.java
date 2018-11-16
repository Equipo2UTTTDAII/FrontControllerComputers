/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontController.View;

/**
 *
 * @author Nayeli
 */
public class SalesView {
    public void show (){
        System.out.println("Esta es la ventana de ventas");
    }
    public void RegistrarVenta(){
        System.out.println("La venta se esta registrando");
    }
    public void CancelarVenta(){
        System.out.println("Se esta cancelando la venta");
    }
    public void ModificarVenta(){
        System.out.println("Se esta modificando la venta");
    }
    public void BuscarArticulo(){
        System.out.println("Buscando Articulo Solicitado...");
    }
    Home h=new Home();
  public void menu(){
      h.show();
  }
}
