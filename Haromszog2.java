/*
* File: Haromszog2.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-02-16
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Haromszog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Haromszog teruletszamitas");

        System.out.print("Adja meg az oldalt (cm) > ");
        double side = sc.nextDouble();
        System.out.print("Adja meg a magassagot (cm) > ");
        double height = sc.nextDouble();

        sc.close();

        double area = side * height / 2;

        System.out.println("A haromszog terulete " + area + " cm^2");
    }
}