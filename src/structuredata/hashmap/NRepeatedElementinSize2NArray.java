/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author pc
 */
public class NRepeatedElementinSize2NArray {
    
    
    public static void main(String[] args) {
        
       // int nums[] = {3,1,2,3,3,4};
       //int nums[]= {2,1,2,5,3,2};
        int nums[]={5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
        
    }
    
    
     public static int repeatedNTimes(int[] nums) {
        
         int result=0;
         int count=1;
         
         HashMap<Integer,Integer> map = new HashMap<>();
         
         for (int i = 0; i < nums.length; i++) {
             
             if(map.containsKey(nums[i])==false){
                 
                 map.put(nums[i], 1);
                          
             }else{
                 result= nums[i];
             }
             
         }
           
        return result;
         
        
    }
    
}
