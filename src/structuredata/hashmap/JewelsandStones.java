/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pc
 */
public class JewelsandStones {
    
    public static void main(String[] args) {
        
        String jewels="aA"; 
        String stones="aAAbbbb";
        
        System.out.println(numJewelsInStones(jewels, stones));
        
    }
    
     public static int numJewelsInStones(String jewels, String stones) {
        int result=0;
        
        HashMap<Character,Integer> Stones = new HashMap<>();
               
        for(char s: stones.toCharArray()){
            
            if(Stones.containsKey(s)){
                Stones.put(s,Stones.get(s)+1);
            }
            else
            {
                Stones.put(s,1);
            }
        }
         System.out.println(Stones);
              
                  
         for(char j: jewels.toCharArray()){
             
            if(Stones.containsKey(j)){
                result+=Stones.get(j);
            }
        }
            
        
        return result;
    }
     
     
     /* public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        HashMap<Integer,Character> map = new HashMap<Integer,Character>();
        HashMap<Integer,Character> map2 = new HashMap<Integer,Character>();
        
         for (int i = 0; i < stones.length() ; i++) {  
             map.put(i, stones.charAt(i));  
         }
         
         for (int i = 0; i < jewels.length() ; i++) {   
             map2.put(i, jewels.charAt(i));   
         }
            
    for(Map.Entry m : map.entrySet()){
            
        for (int i = 0; i < jewels.length(); i++) {
                if(m.getValue().equals(map2.get(i))){
                    result++;
            }
        }      
    }
        
        return result;
    }
    }*/
}



