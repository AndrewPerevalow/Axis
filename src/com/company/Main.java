package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();
                if (x > 0 && y > 0) {
                    System.out.println("1 четверть");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("2 четверть");
                }
                else if (x < 0 && y < 0) {
                    System.out.println("3 четверть");
                }
                else if (x > 0 && y < 0) {
                    System.out.println("4 четверть");
                }
                else if (x == 0 && y == 0){
                    System.out.println("В центре координат");
                }
                else if (x == 0){
                    System.out.println("На оси координат х");
                }
                else if (y == 0){
                    System.out.println("На оси координат у");
                }
    }
}
