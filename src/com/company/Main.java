package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Gra polega na odgadnieciu liczby od 1 do 100 podaj liczbe");
        Scanner wej = new Scanner(System.in);
        double a = wej.nextInt();
        if(a==50)
            System.out.println("WYGRALES!!!");
        else if (a < 50)
            System.out.println("Za malo kolego");
        else if (a > 50)
            System.out.println("No teraz to przesadziles, za duzo");

        // write your code here
    }
}