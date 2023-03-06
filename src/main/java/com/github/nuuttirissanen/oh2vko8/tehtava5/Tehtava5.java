package com.github.nuuttirissanen.oh2vko8.tehtava5;

public class Tehtava5 {

    public static void main(String[] args) {

        Runnable tulostaA = new Tulosta('A');
        Runnable tulostaB = new Tulosta('B');
        Runnable tulostaC = new Tulosta('C');

        Thread t1 = new Thread(tulostaA);
        Thread t2 = new Thread(tulostaB);
        Thread t3 = new Thread(tulostaC);

        t1.start();
        t2.start();
        t3.start();
    }
}
