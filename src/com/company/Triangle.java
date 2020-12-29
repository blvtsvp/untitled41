package com.company;

import java.util.Scanner;

public class Triangle {
    int x0,y0,x1,y1,x2,y2;

    public double perimeter(/*int x0, int y0, int x1, int y1, int x2, int y2*/){
        return Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2))+Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))+
                Math.sqrt(Math.pow(x0-x2,2)+Math.pow(y0-y2,2));
}
    public double xmedian(/*int x0, int x1, int x2*/){
        double xa1 = (x1+x2)/2;
        return (x0+2*xa1)/3;

    }
    public double ymedian(/*int y0, int y1, int y2*/){
        double ya1 = (y1+y2)/2;
        return (x0+2*ya1)/3;

    }
    public double square(/*int x0, int y0, int x1, int y1, int x2, int y2*/){
        return (1/2)*((x1-x0)*(y2-y0) - (x2-x0)*(y1-y0));
    }

    public static void main(String[] args) {
        Triangle a = new Triangle();
        Scanner in = new Scanner(System.in);
        int x0 = in.nextInt();
        int y0 = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        a.x0 = x0;
        a.x1 = x1;
        a.x2 = x2;
        a.y0 = y0;
        a.y1 = y1;
        a.y2 = y2;
        System.out.println("Median = ("+a.xmedian()+";"+a.ymedian()+")");
        System.out.println("Square = "+ a.square());
        System.out.println("Perimeter = "+ a.perimeter());
    }
}
