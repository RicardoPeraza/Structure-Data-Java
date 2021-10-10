/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.arrays;


import java.util.Arrays;
import java.util.HashMap;


/**
 *
 * @author ricar
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber {
    
    
    public static void main(String[] args) {
        
        int nums[]= {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    
     public  static int[] smallerNumbersThanCurrent(int[] nums) {
       
         
         int result[]= new int[nums.length];
         int temporal[]= nums.clone();
         Arrays.sort(temporal);
         int count=1;
         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
         map.put(temporal[0],0);
         
         for (int i = 1; i < nums.length; i++) {
             if(temporal[i] != temporal[i-1]){
                 map.put(temporal[i],count);
                 count++;
             }else{
                 count++;
             }
         }
         for (int i = 0; i < temporal.length; i++) {
             result[i]=map.get(nums[i]);
         }
         
         System.out.println(map);
         return result;
    }
    
}
