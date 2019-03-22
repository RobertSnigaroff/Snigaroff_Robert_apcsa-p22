//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count(int val)
    {
		//add code
    	int count = 0;
    	for (int[] row : m) {
    		for (int num : row) {
    			if (num == val) {
    				count++;
    			}
    		}
    	}
		return count;
    }
    
    public String toString()
    {
    	String output = "";
    	output = output + "Matrix Values\n";
    	for (int[] row : m) {
    		for (int num : row) {
    			output = output + num + "  ";
    		}
    		output = output + "\n";
    	}
    	output = output + "\nThe 7 count is :: " + count(7);
    	output = output + "\nThe 8 count is :: " + count(8);
    	output = output + "\nThe 6 count is :: " + count(6);
    	output = output + "\nThe 21 count is :: " + count(21);
    	return output;
    }
}
