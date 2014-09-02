/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;
import java.util.*;
/**
 *
 * @author andreabarrera
 */
public class SetC {
    private SetFactory<String> set;
    private Set<String> Java;
    private Set<String> Web;
    private Set<String> Cel;
    private Set<String> p1,p2,p3,p4;
    private String ans5;
    
    public SetC(String num){
        set = new SetFactory();
        Java = set.Factory(num);
        Web = set.Factory(num);
        Cel = set.Factory(num);
        p1 = set.Factory(num);
        p2 = set.Factory(num);
        p3 = set.Factory(num); 
        p4 = set.Factory(num);
    }
    public void add(String nom, String tipo){
        switch (tipo) {
              case "a":
                  Java.add(nom);
                  break;
              case "b":
                  Web.add(nom);
                  break;
              default:
                  Cel.add(nom);
                  break;
          }
    }
   public String Preguntas(){
       //pregunta 5: El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web. 
       if(Java.containsAll(Web)){
           ans5 = "Si";
       }else{
           ans5 = "no";
       }
       //pregunta 2: Desarrolladores con experiencia en Java pero que no tengan experiencia en web.
       p2.addAll(Java);
       p2.retainAll(Web);
       //pregunta 1: Desarrolladores con experiencia en Java, web y celulares.
       p1.addAll(Java);
       p1.retainAll(Web);
       p1.retainAll(Cel);
       //pregunta 3: Desarrolladores con experiencia en Web y Celulares pero que no tengan experiencia en java.
       p3.addAll(Web);
       p3.retainAll(Cel);
       p3.removeAll(Java);
       //pregunta 4: Desarrolladores con experiencia en Web o Celulares, pero que no tengan experiencia en java. 
       p4.addAll(Web);
       p4.addAll(Cel);
       p4.removeAll(Java);
       return "Desarrolladores con experiencia en Java, web y celulares: " + p1.toString() + "\nDesarrolladores con experiencia en Java pero que no tengan experiencia en web: " + p2.toString() + "\nDesarrolladores con experiencia en Web y Celulares pero que no tengan experiencia en java: " + p3.toString() + "\nDesarrolladores con experiencia en Web o Celulares, pero que no tengan experiencia en java: " + p4.toString() + "\nEl conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web: " + ans5;
   } 
}
