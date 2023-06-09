package OperatorAssign;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x,y;double z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
         z=Math.sqrt((x*x)+(y*y));
        System.out.println(z);
    }
}
