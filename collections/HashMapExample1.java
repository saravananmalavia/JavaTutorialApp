/*
Java HashMap class implements the Map interface which allows us to store key and value pair,
where keys should be unique. If you try to insert the duplicate key, 
it will replace the element of the corresponding key. 
It is easy to perform operations using the key index like updation, deletion, etc.
HashMap class is found in the java.util package.
HashMap in Java is like the legacy Hashtable class, but it is not synchronized. 
It allows us to store the null elements as well, but there should be only one null key. 
Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. 
It inherits the AbstractMap class and implements the Map interface.
*/

import java.util.*;  
public class HashMapExample1{  
  public static void main(String args[]){  
       HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
       map.put(1,"Mango");  //Put elements in Map  
       map.put(2,"Apple");    
       map.put(3,"Banana");   
       map.put(4,"Grapes");
       map.put(2,"orange");  
       map.put(5,null);   
       map.put(6,null);    
       map.put(null,"null"); 
       map.put(null,"null");       
           
       System.out.println("Iterating Hashmap...");  
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
       }  
  }  
}  