/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gittesting;

/**
 *
 * @author zamil
 */
public class GitTestingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Tasks per person:
         * 1. Fix ONE of the following operations
         * 2. Add and commit the change
         * 3. Create a print statement to show the operation
         * 4. Add and commit the change
         * 5. Create ONE of the specified branches
         * 6. Create the function, add/commit, print, add/commit
         * 7. Merge the new branch with the main branch, then push changes
         * Note: you can also create and push branches to GitHub, but let's not worry about that now
         */
        
        int a = 9;
        int b = 6;
        int c = 2;
        
        // Every person fixes ONE of the follwing: 
        
        int add = a * b * c;
        
        int mult = a + b + c;
        
        int sub = a - (b / c); // should be a - b - c = 1
        
        System.out.println("a + b + c = " + add);
        System.out.println("a * b * c = " + mult);
        System.out.println("a - b - c = " + sub);
        
        // Before you work on the follwing, MAKE SURE YOU PULL FROM GITHUB
        //  so that your local repo is upto date with the online repo
        
        // create a branch called "parity_check" and create a function called isEven(x).
        //  Then print isEven(a)
        
        // create a branch called "exponention" and create a function "power(x, y) = x^y".
        // Then print power(a, c)
        
        // create a branch called "square_root" and create a function "square_root(x) = sqrt(x)".
        // Then print square_root(a)
    }
    
}
