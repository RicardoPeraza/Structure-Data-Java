/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ricar
 */
public class hashMap {
    
    
    
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        
        hashmap.put(1, "Ricardo");
        hashmap.put(2, "Neftali");
        hashmap.put(3, "Peraza");
        
        System.out.println(hashmap);
        
        for(Map.Entry m : hashmap.entrySet()){
            //System.out.println(m.getKey());
            System.out.println("dentro del entry " + m.getValue());
        }
        
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        
        //hashmap.remove(1);
        //System.out.println(hashmap);
        //System.out.println(hashmap.get(2));
        
        
        
    }
    
}
