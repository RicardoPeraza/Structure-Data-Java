/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.arrays;

import java.util.Arrays;

/**
 *
 * @author ricar
 */
public class ShuffletheArray {

    public static void main(String[] args) {
         
        int nums[] = {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }

    public static int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int position = 0;
        for (int i = 0; i < n; i++) {
            result[position] = nums[i];
            result[position + 1] = nums[i + n];
            position += 2;
        }
        return result;
    }
}
