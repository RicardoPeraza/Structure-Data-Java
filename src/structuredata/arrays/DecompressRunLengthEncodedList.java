/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pc
 */
public class DecompressRunLengthEncodedList {
    
    public static void main(String[] args) {
        
       int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
    
    
     public static int[] decompressRLElist(int [] nums) {
         
         List<Integer> list = new ArrayList<>();
         
         for (int i = 0; i < nums.length; i+=2) {
             int a=nums[i];
             int b = nums[i+1];
             for (int j = 0; j < a; j++) {
                 list.add(b);
             }
             
         }
         System.out.println(list);
         int [] result = new int[list.size()];
         for (int i = 0; i < list.size(); i++) {
             result[i]=list.get(i);
         }
        return result;
    }
    
}


