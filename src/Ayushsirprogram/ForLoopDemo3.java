package Ayushsirprogram;

import java.util.Scanner;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 names");
        for (int i=0;i<=5;i++) {
            String name = sc.next();
            System.out.println("Name : "+name);
        }
    }
}
