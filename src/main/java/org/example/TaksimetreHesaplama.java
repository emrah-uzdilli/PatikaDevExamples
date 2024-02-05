package org.example;

public class TaksimetreHesaplama implements Operasyonlar {

    double acilis =10.0,tutar;


    public void TaksimetreHesaplama(int kackm){

        tutar = acilis + (kackm * 2.20);

        if (tutar<20){
            tutar = 20.0;
        }

        System.out.println("Toplam Odenmesi Gereken Tutar:"+tutar);
    }

}
