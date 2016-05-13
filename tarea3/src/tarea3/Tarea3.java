/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.ArrayList;

/**
 *
 * @author GC
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("tu fortuna es: ");
        ArrayList<String>fortuna=new ArrayList();
        fortuna.add("Hoy te va a caer un piano encima");
         fortuna.add("Hoy te van a asaltar");
            fortuna.add("Hoy te ganas la loto, pero perdes el boleto");
                int random = (int)(Math.random()*100)%fortuna.size();
                    System.out.println(fortuna.get(random));
                    
                    System.out.println("tu hobbie es");
                    ArrayList<String>hobbie=new ArrayList();
                   hobbie.add("futbol");
                   hobbie.add("basketball");
                   hobbie.add("ciclismo");
                   int random2 = (int)(Math.random()*100)%hobbie.size();
                   System.out.println(hobbie.get(random2));
                   
                   System.out.println("nombre: ");
                   ArrayList<String>nombre=new ArrayList();
                    nombre.add("GINO");
                    nombre.add("Mauricio");
                    nombre.add("Mario");
                    int random3 = (int)(Math.random()*100)%nombre.size();
                    System.out.println(nombre.get(random3));
                   
                   
                   
    }
    
}
