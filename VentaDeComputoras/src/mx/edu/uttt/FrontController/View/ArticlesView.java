/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontController.View;

import javax.xml.transform.Source;

/**
 *
 * @author Diego
 */
public class ArticlesView {
    
    Home h = new Home();
    
    public void show(){
        System.out.println("ESTA ES LA VENTANA DE ARTICULOS");
    }
    
        
    public void RegistrarArticulo(){
        System.out.println("SE AGREGO UN NUEVO ARTICULO");
    }
    
    public void EliminarArticulo(){
        System.out.println("SE HA ELIMINADO UN PRODUCTO");
    }
    
    public void ActualizarArticulo(){
        System.out.println("SE HA ACTUALIZADO UN ARTICULO");
    }
    
    public void Buscar(){
        System.out.println("SU ARTICULO EN BUSCA ES EL SIGUIENTE:*****");
    }
    
    public void menu(){
    h.show();
    }
  }
