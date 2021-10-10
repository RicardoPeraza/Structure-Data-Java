/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.hashmap;


import java.util.HashMap;
import java.util.HashSet;

import java.util.Set;

/**
 *
 * @author pc
 */
public class UniqueNumberofOccurrences {
    
    /*
    Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
    
    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences
    
    
    Input: arr = [1,2]
    Output: false
    
    Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
    Output: true
    
    
    */
    
    public static void main(String[] args) {
        
        //int arr[] = {1,2,2,1,1,3};
        //int arr[] = {1,2};
        //int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
        int arr[]= {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        
        System.out.println(uniqueOccurrences(arr));
        
    }
    
    public static boolean uniqueOccurrences(int[] arr) {
        boolean result=false;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            
        }
              
        System.out.println(map);
        
       Set<Object> uniqueValues = new HashSet<Object>(map.values()); //hashset solo ingresa valores no duplicados
       
        if(uniqueValues.size()==map.size()){
            result= true;
        }
        else{
            result= false;
        }
       
        return result;
    }
    
}
