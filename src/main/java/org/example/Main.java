package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double tutar,kdvtutar;

      Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tutari Giriniz:");
      tutar = scanner.nextDouble();
        if (tutar>1000) {
            kdvtutar = tutar*0.08;
        }else
            kdvtutar = tutar*0.18;

        System.out.println("KDV Tutariniz:"+kdvtutar);
        System.out.println("KDV Dahil tutariniz:" + (kdvtutar + tutar));








    }

}