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
public class SetFactory<E> {
    private Set set;
    
     public Set Factory(String num){
          switch (num) {
              case "1":
                  set = new HashSet();
                  break;
              case "2":
                  set = new TreeSet();
                  break;
              default:
                  set = new LinkedHashSet();
                  break;
          }
          return set;
   }
    
}
