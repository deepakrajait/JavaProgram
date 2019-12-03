package javaprogram;

import java.util.HashMap;

public class ArrayListCls {

   public static void main(String args[]) {

      /* This is how to declare TreeMap */
      HashMap<Integer, String> tmap = 
             new HashMap<Integer, String>();

      /*Adding elements to TreeMap*/
      tmap.put(1, "Data1");
      tmap.put(23, "Data2");
      tmap.put(70, "Data3");
      tmap.put(4, "Data4");
      tmap.put(2, "Data5");
      
      System.out.println(tmap);
      
      for(Integer i : tmap.keySet()) {
    	  System.out.println(i + " " + tmap.get(i));
      }
    	  	


   }
}
