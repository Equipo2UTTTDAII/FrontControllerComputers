/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontController.Dispatcher;
import mx.edu.uttt.FrontController.View.Home; 
import mx.edu.uttt.FrontController.View.ArticlesView; 
import mx.edu.uttt.FrontController.View.SalesDetailView; 
import mx.edu.uttt.FrontController.View.SalesView; 
/**
 *
 * @author Diego
 */
public class Dispatcher {
   
   private Home homeView;
    private  ArticlesView ar;
    private SalesDetailView sdv;
    private SalesView sv;
   
   public Dispatcher(){
      
      homeView = new Home();
      ar= new ArticlesView();
      sdv = new SalesDetailView();
      sv= new SalesView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("Home")){
         homeView.show();
      }if(request.equalsIgnoreCase("Articulos")){
         ar.show();
      }if(request.equalsIgnoreCase("Ventas")){
         sv.show();
      }
      if(request.equalsIgnoreCase("Detalle de Ventas")){
         sdv.show();
      }
      else{
         homeView.show();
      }	
   }
}
