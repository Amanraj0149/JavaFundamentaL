package CollectionJava.Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> m= new HashMap<>(); // HashTable use karenge jab thread hoga at place of HashMap;
      m.put("aman",1);
      m.put("ajay",7);
      m.put("bajrang",3);
      m.put("Thala",8);
    
       System.out.println(m);
       System.out.println(m.get("bajrang"));

      System.out.println(m.keySet());

      for(String key:m.keySet()){
        System.out.println(key+ " : "+ m.get(key));
      }

    }
    
    // javac CollectionJava\Maps\Maps.java
    // java CollectionJava.Maps.Maps  

    
}


// map is collection key & valuepairs;