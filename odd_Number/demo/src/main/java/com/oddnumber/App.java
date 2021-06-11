package com.oddnumber;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean check_odd(int n){
        return n%2 == 0;
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");
        int n = Integer.parseInt(sc.nextLine());
        String ans = "";
        for(int i = 0 ; i <= n ; i++){
            if(!check_odd(i)){
                ans += i +" ";
            }
        }
        System.out.println(ans);
    }
}
