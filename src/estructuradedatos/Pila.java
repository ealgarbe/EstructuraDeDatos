/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

/**
 *
 * @author educacionit
 */
public class Pila {
    private final int max;
    private final Object[] elementos;
    private int tope = -1;
    
    public Pila(int max){
        this.max=max;
        elementos=new Object [max];
    }
    
    public boolean estaVacia(){
        return (tope<0);
    }
    
    public void empujar(Object e){
        if(tope==max-1){
            elementos[++tope]=e;
        }else{
            System.out.println("ERROR PILA LLENA");
        }
    }
    
    public Object sacar(){
        if(estaVacia()){
           System.out.println("ERROR PILA VACIA");
           return null;
        }else{
           Object e = elementos [tope];
           elementos[tope--]=null;
           return e;
        }
    }
    
    public void mostrar (){
        for(int i=tope;i>0;i--){
            System.out.println(elementos[i]);
        }
      
    }
    
}
