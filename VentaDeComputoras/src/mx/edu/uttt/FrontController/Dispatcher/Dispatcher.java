/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontController.Dispatcher;
import mx.edu.uttt.FrontController.View.Home; 
/**
 *
 * @author Diego
 */
public class Dispatcher {
   
   private Home homeView;
   
   public Dispatcher(){
      
      homeView = new Home();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("Estudiante")){
         
      }
      else{
         homeView.show();
      }	
   }
}
