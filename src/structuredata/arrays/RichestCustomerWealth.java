package structuredata.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricar
 */
public class RichestCustomerWealth {

    public static void main(String[] args) {

        int accounts[][] = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentMax = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentMax += accounts[i][j];
                max = Math.max(max, currentMax);
            }

        }
        return max;
    }

}
