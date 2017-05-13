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
public class Main {
    public static void main(String[]args){
        Pila p = new Pila (5);
        p.empujar("A");
        p.empujar("B");
        p.empujar("C");
        p.empujar("D");
        System.out.println(p.sacar());
        p.mostrar ();
    }
    
}
