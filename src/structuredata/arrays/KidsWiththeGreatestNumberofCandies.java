/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {

        int candies[]={2,3,5,1,3};
        int extraCandies=3;
        
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int candies[], int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int biggest = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > biggest) {
                biggest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= biggest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }

}
