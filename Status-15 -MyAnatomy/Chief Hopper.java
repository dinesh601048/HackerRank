import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static double chiefHopper(int[] arr) {
        double least = 0;
        double energy = 0;
        for (int i=arr.length-1; i>=0; i--) {
            energy = Math.ceil((least + arr[i])/2.0);
            least = energy;
    }

    return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = (int)chiefHopper(arr);
        System.out.println(result);
        in.close();
    }
}
