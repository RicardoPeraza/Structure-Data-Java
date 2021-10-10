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
 * @author ricar
 */
public class NumberofGoodPairs {
    
    
    public static void main(String[] args) {
        
      int nums[] = {1,2,3,1,1,3};
        
        System.out.println(numIdenticalPairs(nums));
        
    }
    
    public static int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            
            }
            else{
                map.put(nums[i],1);
                System.out.println("dentro del else" + map);
            }
        }
        int sum=0;
        System.out.println(map);
      
        int iteration=0;
        for(Map.Entry m:map.entrySet()){
          
            for(int i=1;i<(int)m.getValue();i++){
                 System.out.println( "antes" +  i + "-" + ((int)m.getValue()));
                sum+=i;
                System.out.println( "despues " + i + "-" + ((int)m.getValue()));
            }
        }
        return sum;
    }
        
        
    
    
    
}
