package org.example;

import java.util.Scanner;

public class TriangleHipotenus {


    public double TriangleHipotenusCalculator(int a,int b){
        double c;
        c = Math.sqrt((a*a)+(b*b));

        return c;

    }
    public double TrianglePerimeterandArea(int a,int b){
        double area,hipotenus,perimeter;
        hipotenus= TriangleHipotenusCalculator(a,b);
        perimeter = a + b + hipotenus;
        double u = perimeter/2;
        System.out.println("Ucgenin Cevresi : "+ perimeter);
         area = Math.sqrt(u*(u-a)*(u-b)*(u-hipotenus));

        return area;
    }

}
