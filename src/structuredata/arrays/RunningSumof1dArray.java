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
public class RunningSumof1dArray {

    public static void main(String[] args) {

        int sumas[] = {1, 2, 3, 4};

        System.out.println(Arrays.toString(runningSum(sumas)));
    }

    public static int[] runningSum(int arraySum[]) {
        int[] result = new int[arraySum.length];
        result[0] = arraySum[0];

        for (int i = 1; i < arraySum.length; i++) {
            result[i] = result[i - 1] + arraySum[i];
        }
        return result;

    }
}
