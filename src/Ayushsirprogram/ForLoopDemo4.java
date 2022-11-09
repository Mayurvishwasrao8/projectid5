package Ayushsirprogram;

import java.util.Scanner;

public class ForLoopDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting number");
        int m=sc.nextInt();
        System.out.println("enter the ending number");
        int n=sc.nextInt();
        int sum=0;
        for (int i=m; i<=n;i++){
            if (i%2!=0) {
                sum += i;
            }
            System.out.println("SUM : "+sum);

            }
        }

    }

