package Recurrsion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonnaci {
    static public void main(String[] args) throws IOException {
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isReader);
        System.out.println("Enter any number");
        int n = readInt(reader);

        System.out.println(fibonnaciNumber(n));

    }

    public static int fibonnaciNumber(int n){
        if(n<=1){
            return n;
        }
        int left = fibonnaciNumber(n-1);
        int right = fibonnaciNumber((n-2));
        return left + right;
    }
    private static int readInt(BufferedReader reader) throws IOException {
        while (true) {
            try{
                return Integer.parseInt(reader.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("That's not a number! Try again.");
            }
        }
    }
}
