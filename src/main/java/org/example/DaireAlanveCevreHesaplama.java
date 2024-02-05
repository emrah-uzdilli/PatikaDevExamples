package org.example;

public class DaireAlanveCevreHesaplama implements DaireOperasyonlar{

    float pi = (float) 3.14;
    @Override
    public void daireAlanHesapla(int r) {
        double Alan = pi*r*r;
        System.out.println("Dairenin Alani : "+ Alan);
    }

    @Override
    public void daireCevreHesaplama(int r) {
        double Cevre = 2*pi*r;
        System.out.println("Dairenin Cevresi: "+ Cevre);
    }
}
