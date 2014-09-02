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
    private Set<String> p1,p2,p3,p4,p6,p7;
    private String ans5, ans6;
    private int SJ,SW,SC;
    
    public SetC(String num){
        set = new SetFactory();
        Java = set.Factory(num);
        Web = set.Factory(num);
        Cel = set.Factory(num);
        p1 = set.Factory(num);
        p2 = set.Factory(num);
        p3 = set.Factory(num); 
        p4 = set.Factory(num);
        p6 = set.Factory(num); 
        p7 = set.Factory(num);
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
       if(Web.containsAll(Java)){
           ans5 = "Si";
       }else{
           ans5 = "no";
       }
       //pregunta 2: Desarrolladores con experiencia en Java pero que no tengan experiencia en web.
       p2.addAll(Java);
       p2.removeAll(Web);
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
       //pregunta 6: El conjunto (Java, Web o Celulares) que tenga la cantidad más grande de desarrolladores, y los nombres de esos desarrolladores. 
       SJ = Java.size();
       SW = Web.size();
       SC = Cel.size();
       if(SJ<SW){
           if(SW>SC){
               p6.addAll(Web);
               ans6 = "Desarrolladores Web";
           }else{
               p6.addAll(Cel);
               ans6 = "Desarrolladores de Celulares";
           }
       }else{
           if(SJ>SC){
               p6.addAll(Java);
               ans6 = "Desarrolladores Java";
           }else{
               p6.addAll(Cel);
               ans6 = "Desarrolladores de Celulares";
           }
       }
       return "1.Desarrolladores con experiencia en Java, web y celulares: \n" + p1.toString() + "\n2.Desarrolladores con experiencia en Java pero que no tengan experiencia en web: \n" + p2.toString() + "\n3.Desarrolladores con experiencia en Web y Celulares pero que no tengan experiencia en java: \n" + p3.toString() + "\n4.Desarrolladores con experiencia en Web o Celulares, pero que no tengan experiencia en java: \n" + p4.toString() + "\n5.El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web: \n" + ans5 + "\n6.El conjunto que tenga la cantidad más grande de desarrolladores: \n" + ans6 + "\n" + p6.toString();
   } 
}
