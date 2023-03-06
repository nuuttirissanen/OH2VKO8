package com.github.nuuttirissanen.oh2vko8.tehtava1;

public class Tehtava1 {

    public static void main(String[] args) {
        Runnable tulostaA = new Tulosta("Ja tulostuu", 100);
        Runnable tulostaB = new Tulosta("Ja tulostuu lisää", 100);
        Runnable tulostaC = new Tulosta("Ja vieläkin lisää", 100);

        Thread t1 = new Thread(tulostaA);
        Thread t2 = new Thread(tulostaB);
        Thread t3 = new Thread(tulostaC);

        t1.start();
        t2.start();
        t3.start();
    }
}
