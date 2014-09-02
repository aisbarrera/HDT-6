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
    
    public SetC(String num){
        set = new SetFactory();
        Java = set.Factory(num);
        Web = set.Factory(num);
        Cel = set.Factory(num);
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
}
