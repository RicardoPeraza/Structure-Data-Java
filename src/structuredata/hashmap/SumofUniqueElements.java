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
public class SumofUniqueElements {
    
    
    /*
    You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
    Return the sum of all the unique elements of nums.
    
    Input: nums = [1,2,3,2]
    Output: 4
    Explanation: The unique elements are [1,3], and the sum is 4.
    
    Input: nums = [1,1,1,1,1]
    Output: 0
    Explanation: There are no unique elements, and the sum is 0.
    
    Input: nums = [1,2,3,4,5]
    Output: 15
    Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
    */
    
    
    public static void main(String[] args) {
        
       // int nums[] = {1,2,3,2};
       // int nums[] = {1,1,1,1,1};
        int nums[] = {1,2,3,4,5};
        
        System.out.println(sumOfUnique(nums));
        
    }
    
     public static int sumOfUnique(int[] nums) {
        
         int result=0;
         
         
         HashMap<Integer,Integer> map = new HashMap<>();
         
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);          
            }
            else{
                map.put(nums[i],1);         
            }
        }
         System.out.println(map);
         
         for(Map.Entry m : map.entrySet()){
             if(m.getValue().equals(1)){
                 result+=((int)m.getKey());
             } 
         }
         
         return result;
    }
    
    
}
